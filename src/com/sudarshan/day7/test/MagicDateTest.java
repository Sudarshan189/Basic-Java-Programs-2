package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.MagicDate;

class MagicDateTest {

	@Test
	void testIsMagicDate() {
		assertEquals(true, MagicDate.isMagicDate(2, 7, 14));
		assertEquals(false, MagicDate.isMagicDate(3, 9, 14));
	}

}
