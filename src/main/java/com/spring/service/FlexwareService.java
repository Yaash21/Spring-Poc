package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.FlexwareDomain;
import com.spring.repository.FlexwareRepository;

@Service
public class FlexwareService {
	
	@Autowired
	FlexwareRepository flexwareRepository;
	
public ArrayList<FlexwareDomain> searchByServiceOrder(String serviceOrder){
	
	return flexwareRepository.findByServiceOrder(serviceOrder);
	
}
	
}
