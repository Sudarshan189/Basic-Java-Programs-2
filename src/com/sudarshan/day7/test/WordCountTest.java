package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.sudarshan.day7.WordCount;

class WordCountTest {

	@Test
	void testLineCount() throws IOException {
		assertEquals(6, WordCount.count("C:\\cspro\\sample.txt"));
	}

}