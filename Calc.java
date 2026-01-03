package SelectionPrograms;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			choice = ref.nextInt();
			if (choice >= 1 && choice <= 3) {
				System.out.println("Enter the first value");
				int val1 = ref.nextInt();
				System.out.println("Enter the second value");
				int val2 = ref.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Addition:" + (val1 + val2));
					break;
				case 2:
					System.out.println("Subtraction:" + (val1 - val2));
					break;
				case 3:
					System.out.println("Multiplication:" + (val1 * val2));
					break;
				}
			} else {
				System.out.println("Exited");
			}
		}
	}
}
