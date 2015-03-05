package com.evry.demo.service;

import java.math.BigDecimal;

import com.evry.demo.entity.tables.records.TestRecord;

public interface TestService {
	void createTest(int id, String tekst);
	TestRecord getTest(BigDecimal id);
	void delTest(int id);
	int getCount();
}
