package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.Grep;

class GrepTest {

	@Test
	void testCheckForSting() {
//		Grep.checkForSting("C:\\cspro\\stringcount.txt", "HAI");
		assertEquals(4, Grep.checkForSting("/home/sudarshan/Capgemini/vowelcount.txt", "HAI"));
	}

}
