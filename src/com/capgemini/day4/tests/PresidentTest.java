package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.President;

class PresidentTest {

	President president;

	@BeforeEach
	void setUp() {
		president = new President(124, "krishna", 50000, 2500);

	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(29300.0, president.calculateNetSalary(), 0.02);

	}

	@AfterEach
	void tearDown() {
		president = null;
	}
}
