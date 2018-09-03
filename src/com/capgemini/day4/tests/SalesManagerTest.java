package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee;
import com.capgemini.day4.SalesManager;



class SalesManagerTest {
	
	SalesManager sales;
	
	
	@BeforeEach
	void setUp() {
		sales	 = new SalesManager(124, "krishna", 50000, 2500);
		
	}
	
	@Test
	void testCalculateNetSalary() {
		assertEquals(132800.0, sales.calculateNetSalary(),0.02);
		
	}
	
	
	@AfterEach
	void tearDown() {
		sales = null;
	}
}
