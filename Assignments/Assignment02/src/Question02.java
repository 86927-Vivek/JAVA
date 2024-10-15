import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		System.out.println("----------Welcome to the restro----------------");
		Scanner sc = new Scanner(System.in);
		int choice;
		int total = 0;
		int price = 0;
		int quantity;
		do {
			System.out.println("1. Dosa - 20 Rs");
			System.out.println("2. Samosa - 15 Rs");
			System.out.println("3. Idli - 20 Rs");
			System.out.println("4. Uppit - 30 Rs");
			System.out.println("5. Amboli - 40 Rs");
			System.out.println("6. Tea - 10 Rs");
			System.out.println("7. Coffee -15 Rs");
			System.out.println("8. Generate Bill");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 20 * quantity;
					total += price;
				break;
				case 2:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 15 * quantity;
					total += price;
				break;
				case 3:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 20 * quantity;
					total += price;
				break;
				case 4:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 30 * quantity;
					total += price;	
				break;
				case 5:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 40 * quantity;
					total += price;	
				break;	
				case 6:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 10 * quantity;
					total += price;	
				break;
				case 7:
					System.out.println("Enter Quantity: ");
					quantity = sc.nextInt();
					price = 15 * quantity;
					total += price;	
				break;
				case 8:
					System.out.println("Generate Bill");
					System.out.println("Total bill : "+total);
				break;
			}
		} while (choice != 0);
		
	}

}
