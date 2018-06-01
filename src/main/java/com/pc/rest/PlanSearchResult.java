package com.pc.rest;

import com.pc.spring.data.es.model.Plan;

public class PlanSearchResult {
	private Plan[] plans;
	private int totalPages;
	public Plan[] getPlans() {
		return plans;
	}
	public void setPlans(Plan[] plans) {
		this.plans = plans;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
