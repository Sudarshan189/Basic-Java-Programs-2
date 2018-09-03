package com.sudarshan.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {

	public static int checkForSting(String fileName, String search) {
		int count = 0;
		String lines = null;
		String[] lineArray = null;
		File file = new File(fileName);
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			while ((lines = bufferedReader.readLine().toLowerCase()) != null) {
				lineArray = lines.split("\\s+");
				for (String word : lineArray) {
					if (word.equals(search.toLowerCase())) {
						System.out.println("Line: " + lines + " ->Line Number:" + (count + 1));
						break;
					}
				}
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println(count);
		return count;
	}
}
