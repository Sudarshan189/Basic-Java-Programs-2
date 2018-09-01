package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.Grep;

class GrepTest {

	@Test
	void testCheckForSting() {
		Grep.checkForSting("C:\\cspro\\stringcount.txt", "hai");
		assertEquals(437, Grep.checkForSting("C:\\cspro\\stringcount.txt", "hai"));
	}

}
