package com.assignments6.q1.tester;

import java.util.Scanner;

import com.assignments6.q1.entity.Entity;
import com.assignments6.q1.exceptions.ExceptionLineTooLong;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Type something:-  ");
		String input = new Scanner(System.in).next();
//		System.out.println("length: "+input.length());
		Entity test = new Entity(input);
		try {
			test.setMessage(input);
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}finally {
			System.out.println("Program Executed..");
		}

	}

}
