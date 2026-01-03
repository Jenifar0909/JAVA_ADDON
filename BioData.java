package SelectionPrograms;
import java.util.Scanner;

public class BioData {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name =ref.next();
		System.out.println("Enter your Number:");
		Long phone =ref.nextLong();
		System.out.println("Enter your Age:");
		int age =ref.nextInt();
		System.out.println("Enter your Address:");
		String Address=ref.next();
		System.out.println(name+" "+phone+" "+age+" "+Address);
		}
}
