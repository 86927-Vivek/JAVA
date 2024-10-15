import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		System.out.print("Enter number :- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Given Number: "+num);
		
		String binary = Integer.toBinaryString(num);
		String octal = Integer.toOctalString(num);
		String hex = Integer.toHexString(num);
		
		System.out.println("Binary equivalent: "+binary);
		System.out.println("Octal equivalent: "+octal);
		System.out.println("Hexadecimal equivalent: "+hex);

	}

}
