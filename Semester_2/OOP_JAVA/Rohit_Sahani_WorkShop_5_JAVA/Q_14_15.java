package Week_5;

public class Q_14_15 {
	 public static void main(String[] args) {
	        try {
	            System.out.println(10 / 0);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        }
	        
	        try{
	        	int[] age = {10,20,25,24,28,27,30,31,32};
	        	System.out.println(age[9]);
        	}
	        catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("Error: Index not matching.");

	        }
	    }
}
