package com.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.FlexwareDomain;
import com.spring.service.FlexwareService;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class FlexwareController {
	@Autowired
	FlexwareService flexwareService;
	
	@GetMapping("/{serviceOrder}")
	public ResponseEntity<ArrayList<FlexwareDomain>> getData (@PathVariable String serviceOrder){
		System.out.println("In controller");
		ArrayList<FlexwareDomain> orders = flexwareService.searchByServiceOrder(serviceOrder);
		return new ResponseEntity<ArrayList<FlexwareDomain>>(orders,HttpStatus.CREATED);
		
	}
}