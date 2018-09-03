package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.FileOperation;

class FileOperationTest {

	@Test
	void testReverse() {
		FileOperation.reverse("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\reverseOutput.txt");
		/// home/sudarshan/Capgemini/vowelcount.txt
		FileOperation.convert("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\convertOutput.txt");
		//FileOperation.convert("/home/sudarshan/Capgemini/operation.txt", "/home/sudarshan/Capgemini/copyoperation.txt");
		FileOperation.compare("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\compare.txt");

	}

}
