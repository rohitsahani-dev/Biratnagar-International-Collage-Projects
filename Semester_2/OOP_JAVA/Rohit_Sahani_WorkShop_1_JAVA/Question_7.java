package Workshop1;

import java.util.Scanner;

public class Question_7 {
	   public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	   
	        System.out.println("Enter celcius to convert it in fahrenheit:");
	        
	        double cel = obj.nextDouble();
	        
	        double fahrenheit = (9.0 / 5.0) * cel + 32;
	        
	        System.out.println("fahrenheit: " + fahrenheit);
	        
	       
	        obj.close(); 
}
}