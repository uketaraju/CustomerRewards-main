package com.service.customerRewards.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.customerRewards.model.Rewards;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards, Integer>{

}
