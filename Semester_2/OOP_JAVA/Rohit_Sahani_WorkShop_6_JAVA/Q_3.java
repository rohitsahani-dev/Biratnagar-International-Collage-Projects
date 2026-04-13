package Week_6;
import java.util.*;

public class Q_3 {
	 public static void main(String[] args) {
//    ArrayList Rotation
	        ArrayList<Integer> nums = new ArrayList<>();
	        nums.add(1);
	        nums.add(2); 
	        nums.add(3); 
	        nums.add(4); 
	        nums.add(5);
	        System.out.println("Original ArrayList: "+nums);
	        Collections.rotate(nums, 2);
	        System.out.println("Rotated ArrayList: " + nums);
	    }
}
