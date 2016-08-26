package com.evry.demo.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.evry.demo.entity.tables.Customer;
import com.evry.demo.entity.tables.records.CustomerRecord;
import com.evry.demo.service.CustomerService;
import com.evry.demo.service.CustomerServiceImpl;
import com.evry.demo.service.TestService;
import com.evry.demo.service.TestServiceImpl;


//@Service
@WebService
public class RandomService extends SpringBeanAutowiringSupport   {
	private static final int maxRands = 16;
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@PostConstruct
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	    
	}
	@Autowired 
	public void setTestService(TestServiceImpl test)
	{
		this.test = test;
	}
	
	@Autowired 
	public void setCustomerService(CustomerServiceImpl cust)
	{
		this.cust = cust;
	}
	//@Autowired
	TestService test;
	CustomerService cust;
    
	@WebMethod
	public int nextInt(){
		int i = test.getCount();
		log.debug("LOGG INFO: {}",i);
		return i;
	}
	
	@WebMethod
	public  CustomerRecord getCustomer(BigInteger id){
		CustomerRecord c = cust.getCustomer(id);
		log.debug("LOGG INFO: CustomerService.getCustomer{}",c.getValue(2));
		return c;
	}
	
	@WebMethod
	public int[] nextNInt(final int n){
		final int k = (n > maxRands) ? maxRands : Math.abs(n);
		int[] rands = new int[k];
		Random r = new Random();
		for (int i = 0;i<k; i++) rands[i]=r.nextInt();
		return rands;
	}

	
}
