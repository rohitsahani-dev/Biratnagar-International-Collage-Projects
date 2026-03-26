package Workshop1;
import java.util.Scanner;

public class Question_13 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the quantity of items: ");
	        int quantity = input.nextInt();

	        System.out.print("Enter the price per item: ");
	        double price = input.nextDouble();

	        double TotalCost = quantity * price;

	        System.out.println("The total cost is: " + TotalCost);

	        input.close();
	    }
	}

