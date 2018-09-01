package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import org.junit.jupiter.api.Test;

class FileWithRandomNumbers {

	@Test
	void testFileWithRandomNumbers() {
		Random r = new Random();
		Integer num;
		File file = new File("C:\\cspro\\sudhu1.txt");
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Integer i = 0; i < 100; i++) {
				num = r.nextInt(50);
				writer.println(Integer.toBinaryString(num));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
