package com.pc.spring.data.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.pc.spring.data.es.model.Plan;

@Repository
public interface PlanRepository extends ElasticsearchRepository<Plan, String> {

}
