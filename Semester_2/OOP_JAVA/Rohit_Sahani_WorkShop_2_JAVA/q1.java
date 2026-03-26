package Week_2;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the length of the reactangle : ");
		double length = Obj.nextDouble();
		
		System.out.println("Enter the breadth of the reactangle : ");
		double breadth = Obj.nextDouble();
		
		if(length == breadth) {
		System.out.println("It is a square.");	
		}
		else {
			System.out.println("Not a square");
		}
		Obj.close();
		
	}
}
