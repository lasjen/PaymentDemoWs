package com.evry.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.evry.demo.dao.TestDao;
import com.evry.demo.entity.tables.records.TestRecord;

@Service
public class TestServiceImpl  implements TestService {
	
	@Autowired
	private TestDao dao;
	
	@Override
	public void createTest(int id, String tekst) {
	
	}
	
	@Override
	public TestRecord getTest(BigDecimal id) {
		// TODO Auto-generated method stub
		return dao.getTest(id);
	}

	@Override
	public void delTest(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		return dao.getTestCount();
	}
	
	public void setDao(TestDao dao){
		this.dao=dao;
	}

}
