package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.MyDate;

class MyDateTest {

	@Test
	void testMyDate() {
		MyDate md1 = new MyDate(LocalDate.of(2016, 02, 25));
		MyDate md2 = new MyDate(LocalDate.of(2017, 02, 25));
		MyDate md3 = new MyDate(LocalDate.of(2018, 02, 25));

		ArrayList<MyDate> arrayList = new ArrayList<>();
		arrayList.add(md1);
		arrayList.add(md2);
		arrayList.add(md3);

		
		ArrayList<MyDate> retrivedArrayList = new ArrayList<>();
		


		try (FileOutputStream fileOutput = new FileOutputStream("C:\\cspro\\mydate.ser");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(arrayList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fileInput = new FileInputStream("C:\\cspro\\mydate.ser");
				ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {
				
				retrivedArrayList = (ArrayList<MyDate>)inputStream.readObject();
				System.out.println(retrivedArrayList);
				
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, arrayList.toString().equals(retrivedArrayList.toString()));
	}
}