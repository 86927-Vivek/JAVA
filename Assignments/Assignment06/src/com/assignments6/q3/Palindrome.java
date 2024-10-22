package com.assignments6.q3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Type String: ");
		String str = new Scanner(System.in).next();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		
		System.out.println("Reverse String is "+rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is a Palindrome String....");
		}else {
			System.out.println(str+" is not a Palindrome String....");
		}

	}

}
