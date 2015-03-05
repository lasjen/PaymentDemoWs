package com.evry.demo.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.demo.dao.CustomerDao;
import com.evry.demo.dao.TestDao;
import com.evry.demo.entity.tables.records.CustomerRecord;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao cdao;

	@Override
	public void createCustomer(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerRecord getCustomer(BigInteger id) {
		// TODO Auto-generated method stub
		return cdao.getCustomer(id);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void setCdao(CustomerDao cdao){
		this.cdao=cdao;
	}
	
}
