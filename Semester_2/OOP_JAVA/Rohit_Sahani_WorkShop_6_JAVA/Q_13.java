package Week_6;
import java.util.*;

public class Q_13 {
	public class ColorSort {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        Collections.sort(colors);
	        System.out.println("Ascending: " + colors);

	        Collections.sort(colors, Collections.reverseOrder());
	        System.out.println("Descending: " + colors);
	    }
	}

}
