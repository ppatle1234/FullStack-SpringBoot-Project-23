package com.fullstack.service;

import com.fullstack.entity.Customer;

import java.util.List;

public interface ICustomerService {

    Customer save(Customer customer);

    List<Customer> findAll();
}
