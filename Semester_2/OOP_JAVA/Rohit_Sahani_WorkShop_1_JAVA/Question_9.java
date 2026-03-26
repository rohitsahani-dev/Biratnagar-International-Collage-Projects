package Workshop1;

import java.util.Scanner;

public class Question_9 {
	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Calculate Simple interest");
		System.out.println("Enter rate: ");
		double r = obj.nextDouble();
		
		System.out.println("Enter principle: ");
		double p = obj.nextDouble();
		
		System.out.println("Enter time: ");
		double t = obj.nextDouble();
		
		double SI = +(r*t*p)/100;
		System.out.println("The simple interest is:"+SI);
}
}