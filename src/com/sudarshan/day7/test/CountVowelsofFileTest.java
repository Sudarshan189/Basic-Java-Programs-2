package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.CountVowelsofFile;

class CountVowelsofFileTest {

	@Test
	void testCountVowelsandConsonents() {
		HashSet<CountVowelsofFile> hashSet;
		
//		hashSet = CountVowelsofFile.countVowelsandConsonents("C:\\cspro\\vowelcount.txt");
		hashSet = CountVowelsofFile.countVowelsandConsonents("/home/sudarshan/Capgemini/vowelcount.txt");
		// System.out.println(count);
		// assertEquals("CountVowelsofFile [vowels=12, consonents=16]", count.toString());
		assertEquals("[CountVowelsofFile [vowels=1, consonents=2]]", hashSet.toString());
//		System.out.println(hashSet);
	}

}
