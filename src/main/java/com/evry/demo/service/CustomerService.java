package com.evry.demo.service;

import java.math.BigInteger;

import com.evry.demo.entity.tables.records.CustomerRecord;

public interface CustomerService {
	
	void createCustomer(String name);
	CustomerRecord getCustomer(BigInteger id);
	void deleteCustomer(int id);

}
