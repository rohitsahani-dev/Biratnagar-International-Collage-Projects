package Workshop1;
import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the length to get the Area of square:");
		int length = obj.nextInt();
		
		int area = length*2;
		System.out.println("Area of Square:"+area);
	}
}
