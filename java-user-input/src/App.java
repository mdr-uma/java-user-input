
import java.util.Scanner;
//Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

//		input type string		
//		System.out.println("Enter a text line: ");
		
//		String text = input.nextLine();
		
//		System.out.println("Your line is: " + text);
		
//		input type integer
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		
		System.out.println("Your number is: " + num);
	}

//		just like string and integer we could create a decimal and other different types of input as well with Scanner
}
