package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.DateFormat;

class DateFormatTest {

	@Test
	void testGetFormateOne() {
		DateFormat date = new DateFormat("12022014");
		date.getFormateOne();
		assertEquals("12/02/2014", date.getFormateOne());
		date.getFormateTwo();
		assertEquals("12,February,2014", date.getFormateTwo());
		
	}

}
