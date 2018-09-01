package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.LineCounter;

class LineCounterTest {

	@Test
	void testCountLine() {

		System.out.println(LineCounter.countLine("C:\\cspro\\sample.txt"));

		assertEquals(5, LineCounter.countLine("C:\\cspro\\sample.txt"));

	}

}
