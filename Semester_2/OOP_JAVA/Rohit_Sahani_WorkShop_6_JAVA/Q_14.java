package Week_6;
import java.util.*;

public class Q_14 {
public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(50);
	        numbers.add(10);
	        numbers.add(40);
	        numbers.add(20);
	        numbers.add(30);

	        Collections.sort(numbers);
	        System.out.println("Sorted List: " + numbers);

	        int target = 30;
	        int result = Collections.binarySearch(numbers, target);

	        if (result >= 0) {
	            System.out.println("Element " + target + " found at index: " + result);
	        } else {
	            System.out.println("Element not found.");
	        }
	    }
	
}

