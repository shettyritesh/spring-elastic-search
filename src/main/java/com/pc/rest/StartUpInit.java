package com.pc.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;

import com.pc.spring.data.es.model.Plan;
import com.pc.spring.data.es.service.PlanService;

@Component
public class StartUpInit {
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	@Autowired
	private PlanService planService;

	@PostConstruct
	public void init() {
		//TODO Remove this once actual mechanism to load data is figured out 
		//Load test data
//		 elasticsearchTemplate.deleteIndex(Plan.class);
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
}
