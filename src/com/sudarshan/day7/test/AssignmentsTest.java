package com.sudarshan.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.sudarshan.day7.Assignments;

class AssignmentsTest {

	@Test
	void test() {
		
		
		Assignments assign1 = new Assignments("Java", LocalDate.of(2014, 9, 25));
		Assignments assign2 = new Assignments("C++", LocalDate.of(2014, 9, 24));
		Assignments assign3 = new Assignments(".Net", LocalDate.of(2014, 9, 18));
		Assignments assign4 = new Assignments("Golang", LocalDate.of(2014, 9, 20));
		assertEquals(true, Assignments.add(assign1));
		assertEquals(true, Assignments.add(assign2));
		assertEquals(true, Assignments.add(assign3));
		assertEquals(true, Assignments.add(assign4));
//		assign.show();
		assertEquals(true, Assignments.remove(assign1));
		
		Assignments.show();
		System.out.println("\n");
		
		
		assertEquals(assign4, Assignments.search());
		
	}

}
