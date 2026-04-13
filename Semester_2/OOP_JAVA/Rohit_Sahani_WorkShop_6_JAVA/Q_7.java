package Week_6;
import java.util.*;

public class Q_7 {
	    public static void main(String[] args) {
	        ArrayDeque<String> Queue = new ArrayDeque<>();
	        Queue.add("Document1");
	        Queue.add("Document2");
	        Queue.add("Document3");
	        Queue.remove(); 
            Queue.add("Document4");
	        Queue.add("Document5");
	        
	        System.out.println("Next job (peek): " + Queue.peek());
	        System.out.println("Queue list: " + Queue);
	    }
	}
