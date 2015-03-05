package com.evry.demo.dao;

import java.math.BigDecimal;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.evry.demo.entity.*;
import com.evry.demo.entity.tables.Test;
import com.evry.demo.entity.tables.records.CustomerRecord;
import com.evry.demo.entity.tables.records.TestRecord;

import static com.evry.demo.entity.Tables.*;


@Repository
public class TestDao  {

	@Autowired
	public DSLContext dsl;
	
	Test t = TEST.as("t");
	
	public TestRecord getTest(BigDecimal id){
		Result<Record2<BigDecimal, String>> result = dsl.select(t.ID,t.TEKST).from(t).where(t.ID.equal(id)).fetch();
		
		TestRecord t0 = new TestRecord();
		t0.setId(result.getValue(0, t.ID));
		t0.setTekst(result.getValue(0, t.TEKST));
		return t0;
	}
	
	public Integer getTestCount(){
		
		Record1<Integer> result =  dsl.selectCount().from(t).fetchOne();
		
		return result.value1();
	}

}
