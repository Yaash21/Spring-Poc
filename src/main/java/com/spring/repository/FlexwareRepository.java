package com.spring.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.domain.FlexwareDomain;
@Repository
public interface FlexwareRepository extends CrudRepository<FlexwareDomain, Integer> {
	
	public ArrayList<FlexwareDomain> findByServiceOrder(String ServiceOrder);
	

}
