package com.pc.rest;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pc.spring.data.es.model.Plan;
import com.pc.spring.data.es.service.PlanService;

@RestController
@PropertySource("classpath:application.properties")
@SpringBootApplication(scanBasePackages = { "com.pc.*" })
public class PlansController {

	@Autowired
	private PlanService planService;

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	@RequestMapping("/search")
	public PlanSearchResult search(@RequestParam(value = "sponsorState",defaultValue="") String sponsorState,
			@RequestParam(value = "sponsorName",defaultValue="") String sponsorName,
			@RequestParam(value = "planName",defaultValue="") String planName,
			@RequestParam(value = "pageRequest",defaultValue="0") int pageRequest,
			@RequestParam(value = "pageSize",defaultValue="5") int pageSize) {

		PlanSearchResult result = getSearchResults(sponsorState, sponsorName, planName, pageRequest, pageSize);
		
		return result;
	}

	private PlanSearchResult getSearchResults(String sponsorState, String sponsorName, String planName, int pageRequest,
			int pageSize) {
		Page<Plan> planPages= planService.search(planName, sponsorName, sponsorState, new PageRequest(pageRequest, pageSize));
		PlanSearchResult result= new PlanSearchResult();
		result.setTotalPages(planPages.getTotalPages());
		Plan[] plans= new Plan[planPages.getNumberOfElements()];
		Iterator<Plan> iter= planPages.iterator();
		int i=0;
		while(iter.hasNext()) {
			plans[i]=iter.next();
		}
		result.setPlans(plans);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(PlansController.class, args);
	}
}
