package Workshop1;
import java.util.Scanner;

public class Question_14 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the amount in U.S. dollars: ");
	        double USD = input.nextDouble();

	        System.out.print("Enter the exchange rate: ");
	        double ERate = input.nextDouble();

	        double Amount = USD * ERate;

	        System.out.println("The converted amount is: " +Amount);

	        input.close();
	    }
	}