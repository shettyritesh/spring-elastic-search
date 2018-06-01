package com.pc.spring.data.es.service;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pc.spring.data.es.model.Plan;

public interface PlanService {
    Plan save(Plan article);
    Iterable<Plan> findAll();
    Page<Plan> search(QueryBuilder queryBuildr, Pageable pageble);    
    Page<Plan> search(String planName,String sponsorName,String sponsorState, Pageable pageble);
}
