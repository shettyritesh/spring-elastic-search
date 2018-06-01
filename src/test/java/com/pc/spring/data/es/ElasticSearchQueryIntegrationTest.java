package com.pc.spring.data.es;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pc.spring.data.es.config.Config;
import com.pc.spring.data.es.model.Plan;
import com.pc.spring.data.es.service.PlanService;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class ElasticSearchQueryIntegrationTest {

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private PlanService planService;
    
	@Before
	public void before() {
		elasticsearchTemplate.deleteIndex(Plan.class);
		elasticsearchTemplate.createIndex(Plan.class);
		elasticsearchTemplate.putMapping(Plan.class);
		elasticsearchTemplate.refresh(Plan.class);

		Plan plan = new Plan();
		plan.setAckId("20180101115412P040000039321001");
		plan.setSponsorDfeName("DOVE CONSULTING CORP");
		plan.setSpons_Dfe_Loc_Us_State("NC");
		plan.setPlanName("DOVE CONSULTING CORP. RETIREMENT PLAN");
		planService.save(plan);

	}

	// This is the one
	@Test
	public void searchWithSponsorName() {
		
    	Page<Plan> pges= planService.search("CONSULTING",null,"NC", new PageRequest(0, 2));
        //assertEquals(pges.getTotalElements()==1,true);
    	System.out.println("getTotalPages "+pges.getTotalPages());
        System.out.println("getNumberOfElements"+pges.getNumberOfElements());
        System.out.println("getNumber "+pges.getNumber());
        System.out.println("getSize"+ pges.getSize());
       
	}

}
