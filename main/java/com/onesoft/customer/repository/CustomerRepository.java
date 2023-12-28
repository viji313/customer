package com.onesoft.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
