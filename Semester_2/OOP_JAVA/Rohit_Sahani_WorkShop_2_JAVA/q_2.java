package Week_2;
import java.util.Scanner;
public class q_2 {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.print("Enter a number to get the multiplication table : ");
		int num = Obj.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+i*num);
		}
		 Obj.close();
		
	}
	
}

