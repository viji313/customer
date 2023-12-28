package com.onesoft.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.customer.dao.CustomerDao;
import com.onesoft.customer.entity.Customer;
import com.onesoft.customer.exception.AgeNotFound;
import com.onesoft.customer.exception.IdNotFound;
@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;

	public String setData(List<Customer> c) {
		
		return cd.setData(c);
	}

	public Customer getData(int id) {
		
		return cd.getData(id);
	}

}


