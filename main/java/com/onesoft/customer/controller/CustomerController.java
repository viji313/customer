package com.onesoft.customer.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.onesoft.customer.entity.Customer;
import com.onesoft.customer.exception.AgeNotFound;
import com.onesoft.customer.exception.IdNotFound;
import com.onesoft.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/myadmin")
public class CustomerController {
	@Autowired
	CustomerService cs;
static Logger log = Logger.getLogger(CustomerController.class);
 
	@PostMapping(value = "/store")
	public String setData(@RequestBody List<Customer> c) {
		PropertyConfigurator.configure("log4jcust.properties");
		log.info(cs.setData(c));
		return cs.setData(c);
	}

	@GetMapping(value = "/get/{id}")

	public Customer getData(@PathVariable int id) {
		PropertyConfigurator.configure("log4jcust.properties");
		log.info(cs.getData(id));
		return cs.getData(id);
	}
	@GetMapping(value="/data")
	public String getValue(@RequestParam String name, @RequestParam int password) {
		if(name.equals("viji")&& password==1995)
		{
			return "Success";
		}
		else
		{
			return "decliend";
		}
	}
@Value("${myname}")
	
	String name;
	@GetMapping(value="/getName")
	public String getName()
	{
		return name;
	}
	
	}

	
	

