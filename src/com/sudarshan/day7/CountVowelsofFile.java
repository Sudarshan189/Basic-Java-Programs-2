package com.sudarshan.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsofFile {

	private int vowels;
	private int consonents;

	public CountVowelsofFile() {
		super();
	}

	public CountVowelsofFile(int vowels, int consonents) {
		super();

		this.vowels = vowels;
		this.consonents = consonents;
	}

	public static HashSet<CountVowelsofFile> countVowelsandConsonents(String link) {
		Set<CountVowelsofFile> hashSet = new HashSet<>();
		int vowels = 0;
		int consonents = 0;
		try (FileReader fileReader = new FileReader(link); BufferedReader reader = new BufferedReader(fileReader)) {
			String buffer;
			while ((buffer = reader.readLine()) != null) {
				for (int i = 0; i < buffer.length(); i++) {
					switch (buffer.toLowerCase().charAt(i)) {
					case 'a':

					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowels++;
						break;
					case ' ':
						break;
					default:
						consonents++;
					}
				}
			}

			hashSet.add(new CountVowelsofFile(vowels, consonents));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return (HashSet<CountVowelsofFile>) hashSet;
	}

	@Override
	public String toString() {
		return "CountVowelsofFile [vowels=" + vowels + ", consonents=" + consonents + "]";
	}

}
