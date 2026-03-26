package Week_2;
import java.util.Scanner;
public class q_5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 'y' if you have a medical cause and 'n' for not : ");
	    
	    char cause = sc.next().charAt(0);
	    
	    if(cause == 'Y' || cause=='y') {
	    	System.out.println("You are not allowed to sit in the exam");
	    }
	    else {
	    	System.out.println("You are allowed to sit in the exam");
	    }
	        sc.close();

}
}