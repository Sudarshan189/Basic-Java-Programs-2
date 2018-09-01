package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.CountVowelsofFile;

class CountVowelsofFileTest {

	@Test
	void testCountVowelsandConsonents() {
		CountVowelsofFile count;
		
		count = CountVowelsofFile.countVowelsandConsonents("C:\\cspro\\vowelcount.txt");
		// System.out.println(count);
		assertEquals("CountVowelsofFile [vowels=12, consonents=16]", count.toString());
	}

}
