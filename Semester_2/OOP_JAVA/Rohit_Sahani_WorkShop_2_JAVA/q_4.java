package Week_2;

import java.util.Scanner;

public class q_4 {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter age of first person: ");
		        int age1 = sc.nextInt();
		        
		        System.out.print("Enter age of second person: ");
		        int age2 = sc.nextInt();
		        
		        System.out.print("Enter age of third person: ");
		        int age3 = sc.nextInt();

		     
		     int oldest;
		        if (age1 >= age2 && age1 >= age3) {
		            oldest = age1;
		        } else if (age2 >= age1 && age2 >= age3) {
		            oldest = age2;
		        } else {
		            oldest = age3;
		        }

		       
		      
		     int youngest;
		        if (age1 <= age2 && age1 <= age3) {
		            youngest = age1;
		        } else if (age2 <= age1 && age2 <= age3) {
		            youngest = age2;
		        } else {
		            youngest = age3;
		        }

		        System.out.println("Oldest age is: " + oldest);
		        System.out.println("Youngest age is: " + youngest);
		        
		        sc.close();
		    }
		

		
	}

