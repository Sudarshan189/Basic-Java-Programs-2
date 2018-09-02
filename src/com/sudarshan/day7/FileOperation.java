package com.sudarshan.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class FileOperation {

	public static boolean reverse(String fileLink1, String fileLink2) {

		File file1 = new File(fileLink1);
		File file2 = new File(fileLink2);

		Stack<Character> stack = new Stack<>();

		try (FileReader fileReader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(fileReader)) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				for (int i = 0; i < lines.length(); i++) {
					stack.push(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (PrintWriter printWriter = new PrintWriter(file2)) {
			System.out.println(stack.size());
			int size = stack.size();
			for (int i = 0; i < size; i++) {
				printWriter.print(stack.pop());
			}
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyStackException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public static boolean convert(String fileLink1, String fileLink2) {

		File file1 = new File(fileLink1);
		File file2 = new File(fileLink2);

		Queue queue = new Queue();

		try (FileReader fileReader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(fileReader)) {
			String lines;
			while ((lines = bufferReader.readLine()) != null) {
				for (int i = 0; i < lines.length(); i++) {
					queue.add(lines.charAt(i));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (PrintWriter printWriter = new PrintWriter(file2)) {
			System.out.println(queue.size());
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				printWriter.print(queue.remove());
			}
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyStackException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

}
