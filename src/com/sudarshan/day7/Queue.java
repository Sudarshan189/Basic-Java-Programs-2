package com.sudarshan.day7;

public class Queue {
	private char[] array = new char[500];;
	private int index=1;

	public Queue() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int size() {
		return index;
	}

	public void enQueue(Character c) {
//		if (array.length != 100) {
			array[index++] = c;
			
//		}
	}

	public char deQueue() {
//		if (array.length != 0) {
			System.err.println(array[index]);
			return array[--index];
//		}
//		return ' ';
	}
}
