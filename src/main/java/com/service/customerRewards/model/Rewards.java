package com.service.customerRewards.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
public class Rewards {

	public Rewards() {
		super();
	}

	public Rewards(Integer id, String condition, Integer rewardpoints) {
		super();
		this.id = id;
		this.condition = condition;
		this.rewardpoints = rewardpoints;
	}

	@Id
	private Integer id;
	
	private String condition;
	
	private Integer rewardpoints;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(Integer rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
	
	

}
