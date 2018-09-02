package com.sudarshan.day7;

public class Queue {
	private char[] array = new char[500];;
	private int front = 1;
	private int rear = 1;

	public Queue() {
		super();
	}

	public int size() {
		return (front - rear);
	}

	public void add(Character c) {
		array[front++] = Character.toUpperCase(c);
	}

	public char remove() {
		return array[rear++];
	}

}
