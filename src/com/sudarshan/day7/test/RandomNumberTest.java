package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
	void testRandomNumber() {

		Random r = new Random();

		File fileOutputStream = new File("C:\\cspro\\boy.txt");

		try (PrintWriter outputStream = new PrintWriter(fileOutputStream)) {
			for (Integer i = 0; i < 100; i++) {
				outputStream.println(r.nextInt(50));
			}

		} catch (Exception e) {
		}

		TreeSet<Integer> treeSet = new TreeSet<>();
		try (FileReader reader = new FileReader(fileOutputStream); BufferedReader bfReader = new BufferedReader(reader)) {
			String line;
			while((line = bfReader.readLine()) != null) {
				treeSet.add(Integer.parseInt(line));
			}

			for (Integer integer : treeSet) {
				System.out.println(integer);
			}
			//System.out.println(treeSet.size());
		} catch (Exception e) {
		}
	}
}
