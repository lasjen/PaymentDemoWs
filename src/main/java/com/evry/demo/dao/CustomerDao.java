package com.evry.demo.dao;

import java.math.BigInteger;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.demo.entity.tables.Customer;
import com.evry.demo.entity.tables.records.CustomerRecord;

import static com.evry.demo.entity.Tables.*;

@Repository
public class CustomerDao {
	
	@Autowired
	public DSLContext dsl;
	
	Customer c = CUSTOMER.as("c");
	
	public CustomerRecord getCustomer(BigInteger id){
		CustomerRecord cr = dsl.selectFrom(CUSTOMER).where(CUSTOMER.ID.equal(id)).fetchOne();
	
		return cr;
	}
	
	public Integer getCustomerCount(){
		
		Record1<Integer> result =  dsl.selectCount().from(c).fetchOne();
		
		return result.value1();
	}
	

}
