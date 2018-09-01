package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistsTest {

	@Test
	void testFileExistsTest() {
		File file = new File("C:\\cspro\\sample.ser");
		assertEquals(true, file.exists());
	}

}
