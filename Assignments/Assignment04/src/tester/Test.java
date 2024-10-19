package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x   Cordinate of point 1 : ");
		
		double d1 = sc.nextDouble();
		System.out.println("Enter  y  Cordinate of point 1 : ");
		double d2 = sc.nextDouble();
		
		System.out.println("Enter x   Cordinate of point 2: ");
		double d3 = sc.nextDouble();
		
		System.out.println("Enter y   Cordinate of point 2 : ");
		double d4 = sc.nextDouble();
		
		
		Point2D p1 = new Point2D(d1, d2);
		
		Point2D p2 = new Point2D(d3, d4);
		
		
		System.out.println("Co-ordinates of point 1 is : " + p1.getDetails());
		
		
		System.out.println("Co-ordinates of point 2 is : " + p2.getDetails());
		
		
		
		if(p1.isEqual(p2))
		{
			System.out.println("Ponts are equal");
		}
		else
		{
			
			System.out.println("Distance between p1 and p2 is :" + p1.calculateDistance(p2));
			
			
		}


}
}
