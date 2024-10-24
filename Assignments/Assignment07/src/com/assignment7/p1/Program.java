	package com.assignment7.p1;
	
	import java.util.Arrays;
import java.util.Comparator;
	import java.util.Scanner;
	
	class StudentCityAsc implements Comparator<Student> {
	
		@Override
		public int compare(Student o1, Student o2) {
	
			return o1.getCity().compareTo(o2.getCity());
		}
	
	}
	
	class StudentMarksDesc implements Comparator<Student> {
	
		@Override
		public int compare(Student o1, Student o2) {
	
			return Double.compare(o2.getMarks(), o1.getMarks());
		}
	
	}
	
	class StudentNameAsc implements Comparator<Student> {
	
		@Override
		public int compare(Student o1, Student o2) {
	
			return o1.getName().compareTo(o2.getName());
		}
	
	}
	
	class StudentRollAsc implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return Integer.compare(o1.getRoll(), o2.getRoll());
		}
		
	}
	
	
	
	public class Program {
	
		public static int menu(Scanner sc) {
			System.out.println("0. EXIT");
			System.out.println("1. Display All Students ");
			System.out.println("2. Display Students Sorted on city");
			System.out.println("3. Display Students Sorted on marks in desc");
			System.out.println("4. Display Students Sorted on name");
			System.out.println("5. Display Students Sorted on roll no");
			return sc.nextInt();
		}
		public static void displayAllStudents(Student[] arr) {
			System.out.println("*************************");
			for (Student student : arr)
				System.out.println(student);
			System.out.println("*************************");
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Student arr[] = new Student[5];
			Comparator<Student> comparator;
			arr[0] = new Student(5, "Mukesh","Delhi", 45.03);
			arr[1] = new Student(1, "Anil","Mumbai", 55.63);
			arr[2] = new Student(4, "Suresh","Banglore", 77.63);
			arr[3] = new Student(3, "Ramesh","Hyderabad", 88.07);
			arr[4] = new Student(2, "Sham","Pune", 85.18);
			int choice;
			
			while ((choice = menu(sc)) != 0) {
				switch (choice) {
				case 1:
					displayAllStudents(arr);
					break;
//				case 2:
//					Arrays.sort(arr);
//					displayAllStudents(arr);
//					break;
				case 2:
					comparator = new StudentCityAsc();
					Arrays.sort(arr, comparator);
					displayAllStudents(arr);
					break;
				case 3:
					comparator = new StudentMarksDesc();
					Arrays.sort(arr, comparator);
					displayAllStudents(arr);
					break;
				case 4:
					comparator = new StudentNameAsc();
					Arrays.sort(arr, comparator);
					displayAllStudents(arr);
					break;
					
				case 5:
					Arrays.sort(arr);
					displayAllStudents(arr);
					break;	
				default:
					System.out.println("Wrong choice...");
					break;
				}
			}
		}
	
	}
