package com.onesoft.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.customer.entity.Customer;
import com.onesoft.customer.repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cr;

	public String setData(List<Customer> c) {

		cr.saveAll(c);
		return "saved";

	}

	public Customer getData(int id) {
		return cr.findById(id).get();

	}

	
		
	}


