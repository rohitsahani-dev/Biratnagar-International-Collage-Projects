package Week_6;
import java.util.*;
public class Q_9 {
	public static void main(String[] args) {
		  HashSet<String> set1 = new HashSet<>();
	        set1.add("Dog"); 
	        set1.add("Cat");
	        set1.add("Elephant"); 
	        set1.add("Lion");

	        HashSet<String> set2 = new HashSet<>();
	        set2.add("Cat"); 
	        set2.add("Giraffe"); 
	        set2.add("Dog"); 
	        set2.add("Monkey");

	        System.out.println("Union: " + performUnion(set1,set2));
	        System.out.println("Intersection: " + performIntersection(set1, set2));
	        System.out.println("Difference (set1 - set2): " + performDifference(set1, set2));
	}
	        
	
	        public static Set<String> performUnion(Set<String> s1, Set<String> s2) {
	            Set<String> result = new HashSet<>(s1);
	            result.addAll(s2); 
	            return result;
	        }

	    
	        public static Set<String> performIntersection(Set<String> s1, Set<String> s2) {
	            Set<String> result = new HashSet<>(s1);
	            result.retainAll(s2); 
	            return result;
	        }

	      
	        public static Set<String> performDifference(Set<String> s1, Set<String> s2) {
	            Set<String> result = new HashSet<>(s1);
	            result.removeAll(s2); 
	            return result;
	        }
	    

	
}
