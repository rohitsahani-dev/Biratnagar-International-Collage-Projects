package Workshop1;
import java.util.Scanner;
public class Question_10 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = obj.nextInt();
		
		System.out.println("Enter Second number:");
		int b = obj.nextInt();	
		
		int sum = a+b;
		int diff=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mult);
		System.out.println(div);
	}
}
