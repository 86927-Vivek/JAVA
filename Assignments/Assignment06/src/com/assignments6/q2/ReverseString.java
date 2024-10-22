package com.assignments6.q2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type String: ");
		String str = new Scanner(System.in).next();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
	
		
		System.out.println("Reverse String is "+rev);
		

	}

}
