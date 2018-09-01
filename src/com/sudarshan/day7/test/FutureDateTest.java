package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.FutureDate;

class FutureDateTest {

	@Test
	void testFutureDate() {
		FutureDate date = new FutureDate("12/12/2017");

		assertEquals("2017-12-14",date.futureDate(2).toString());
	}

}
