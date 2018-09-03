package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Television;

class TelevisionTest {
@BeforeEach
void setup() {
	
	new Television("on",100,20);
}
	@Test
	void testchangeState() {
		assertEquals("off",Television.changeState());
	}
	
	@Test
	void testchangeChannel() {
		assertEquals(101,Television.changeChannel());
	}
	@Test
	void testincreaseVolume() {
		assertEquals(21,Television.increaseVolume());
	}
	@Test
	void testdecreaseVolume() {
		assertEquals(19,Television.decreaseVolume());
	}

}
