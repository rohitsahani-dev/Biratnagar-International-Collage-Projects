package Week_2;

import java.util.Scanner;

public class q_7 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number to check if it is a even or odd and also if it is even is it divisible by 7 or not and if it is odd is it divisible by 7 or not .");
		 int num = sc.nextInt();
		 if(num%2==0) {
			 System.out.println("It is a Even number");
			 if(num%4==0) {
				 System.out.println("Divisible by 4");
			 }
			 else {
				 System.out.println("Not Divisible by 4"); 
			 }
		 }else {
			 System.out.println("Is is Odd number ");
			 
			 if(num%7==0) {
				 System.out.println("Divisible by 7");
			 }
			 else {
				 System.out.println("Not Divisible by 7"); 
		 }
		 sc.close();
	 }
	}
	}

