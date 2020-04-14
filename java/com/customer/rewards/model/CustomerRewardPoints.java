package com.customer.rewards.model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class CustomerRewardPoints {

	@JsonInclude  
	@Transient   
	protected Long points;

	public abstract Long getPoints();

}
