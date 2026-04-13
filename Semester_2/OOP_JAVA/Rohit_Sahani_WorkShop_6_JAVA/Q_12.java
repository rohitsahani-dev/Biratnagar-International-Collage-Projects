package Week_6;
import java.util.*;
public class Q_12 {
	
	    public static void main(String[] args) {
	        Integer[] numbers = {45, 12, 89, 5, 33};

	        Arrays.sort(numbers);
	        System.out.println("Ascending: " + Arrays.toString(numbers));

	        Arrays.sort(numbers, Collections.reverseOrder());
	        System.out.println("Descending: " + Arrays.toString(numbers));
	    }
	}


