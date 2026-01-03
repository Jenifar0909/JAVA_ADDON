package SelectionPrograms;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int correctpin=1234;
		int balance=15000;
		System.out.println("Enter Your pin...");
		int pin=ref.nextInt();
		if(pin==correctpin) {
			System.out.println("Enter the amount?");
			int withdraamount=ref.nextInt();
			if(withdraamount<=balance) {
				System.out.println("withdraw successfully");
			}
			else {
				System.out.println("Insufficient balance");
				}
			}
		else {
			System.out.println("Invalid pin number");
			}
		}
}
