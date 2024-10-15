import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 :- ");
		
		double num1;
		double num2;
		double avg;
		if(sc.hasNextDouble() && sc.hasNextInt()) {
			System.out.println("ERROR");
			
		}
		else if(sc.hasNextDouble() || sc.hasNextInt()) {
			num1 = sc.nextDouble();
			System.out.println("ENTER NUMBER 2 :");
			if(sc.hasNextDouble() && sc.hasNextInt()) {
				System.out.println("ERROR");
				
			}
			else if(sc.hasNextDouble() || sc.hasNextInt()) {
				num2 = sc.nextDouble();
				avg = (num1+num2)/2;
				System.out.println("Average of two numbers : "+avg);
			}
			else {
				System.out.println("ERROR");
			}
			
			
		}
		else {
			System.out.println("ERROR");
		}
		
	

}
}
