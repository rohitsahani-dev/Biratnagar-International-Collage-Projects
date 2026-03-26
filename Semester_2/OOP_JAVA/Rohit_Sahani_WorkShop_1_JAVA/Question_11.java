package Workshop1;
import java.util.Scanner;

	public class Question_11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter distance in miles: ");
	        double miles = scanner.nextDouble();

	        double kilometers = miles * 1.60934;

	        System.out.println("In miles: "+miles+"\nIn kilometers: "+kilometers);

	        scanner.close();
	    }
	}

