package Week_6;
import java.util.*;

public class Q_4 {
	 public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<String>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("White");

	      
	        int i=1;
	        for(String color : colors) {
	            System.out.println("Color " + i +": "+ color);
	            i++;
	        }

	        System.out.println("Is their color red in list ? " + colors.contains("Red"));

	        Collections.shuffle(colors);
	        System.out.println("Shuffled: " + colors);

	        Collections.sort(colors);
	        System.out.println("Sorted: " + colors);
	    }
}
