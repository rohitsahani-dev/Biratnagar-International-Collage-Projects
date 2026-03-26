package Week_2;
import java.util.Scanner;
public class q_9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the sum of the numbers: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
      
       while(count<n) {
        if(n%2==0) {
        	sum += n;
        }
       }

        System.out.println("Sum of first " + n + " even numbers: " + sum);
        sc.close();
    }
	
}
