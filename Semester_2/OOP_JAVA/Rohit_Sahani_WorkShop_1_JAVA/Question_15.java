package Workshop1;
import java.util.Scanner;

public class Question_15 {
	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int num1 = obj.nextInt();

	        System.out.print("Enter the second integer: ");
	        int num2 = obj.nextInt();

	        int sum = num1 + num2;
	        int diff = num1 - num2;
	        int prod = num1 * num2;
	        double quot = num1 / num2;

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + diff);
	        System.out.println("Product: " + prod);
	        System.out.println("Quotient: " + quot);
	    }

}
