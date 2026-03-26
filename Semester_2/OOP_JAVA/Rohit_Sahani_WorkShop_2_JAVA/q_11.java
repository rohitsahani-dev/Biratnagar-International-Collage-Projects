package Week_2;

import java.util.Scanner;

public class q_11 {
	   public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt(); 
	        int factorial = 1; 

	        if (num < 0) {
	            System.out.println("There is No factorial for 0 or less.");
	        } else {
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial of " + num + " is: " + factorial); 
	        }
	        sc.close();
	    }
}
