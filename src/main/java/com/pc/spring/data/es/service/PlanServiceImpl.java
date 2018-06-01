package com.pc.spring.data.es.service;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pc.common.StringUtils;
import com.pc.spring.data.es.model.Plan;
import com.pc.spring.data.es.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

    private static final String SPONSOR_DFE_NAME = "SPONSOR_DFE_NAME";
	private static final String SPONS_DFE_LOC_US_STATE = "SPONS_DFE_LOC_US_STATE";
	private static final String PLAN_NAME = "PLAN_NAME";
	private final PlanRepository planRepository;
    
    @Autowired
    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public Plan save(Plan article) {
        return planRepository.save(article);
    }
    
    @Override
    public Iterable<Plan> findAll() {
        return planRepository.findAll();
    }
    
    @Override
    public Page<Plan> search(QueryBuilder queryBuilder, Pageable pageble) {
    	return planRepository.search(queryBuilder,pageble);
    }
    
    @Override
    public Page<Plan> search(String planName,String sponsorName,String sponsorState, Pageable pageble)
    {
    	
    	BoolQueryBuilder qb = QueryBuilders.boolQuery();
    	queryStringQuery(PLAN_NAME,planName, qb);
    	matchQuery(SPONS_DFE_LOC_US_STATE,sponsorState, qb);
    	queryStringQuery(SPONSOR_DFE_NAME,sponsorName, qb);    	
    	System.out.println(qb.toString());
    	return search(qb, pageble);
    }

	private void matchQuery(String columnName,String value, BoolQueryBuilder qb) {
		if(!StringUtils.ifStringNullOrEmpty(value)) {
	    	QueryBuilder sponsorStateQB = QueryBuilders.matchQuery(columnName, value);
	    	qb.must(sponsorStateQB);
    	}
	}

	private void queryStringQuery(String columnName,String sponsorName, BoolQueryBuilder qb) {
		if(!StringUtils.ifStringNullOrEmpty(sponsorName)) {    		
	    	QueryBuilder sponsorNameQB = QueryBuilders.queryStringQuery(sponsorName).field(columnName);
	    	qb.must(sponsorNameQB);
    	}
	}
       
}
