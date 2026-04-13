package Week_6;
import java.util.*;

public class Q_1 {
	    public static void main(String[] args) {
//	 Student list
	        ArrayList<String> students = new ArrayList<String>();
	        students.add("Rohit");
	        students.add("Aayush");
	        students.add("Nasad");
	        System.out.println("Old Students list: " + students);
	        students.remove("Aayush"); 
	        
	        System.out.println("Updated Students list: " + students);
	        
//	 Examinees list
	        System.out.println("---------------------------------------------------------");
	        ArrayList<String> examinees = new ArrayList<String>();
	        examinees.add("Rohit");
	        examinees.add("Nasad");
	        examinees.add("rohan");
	        examinees.add("pratik");
	        examinees.add("Yukesh");
	        System.out.println("Old Examinees list : " + examinees);
	        examinees.remove("rohan"); 
	        System.out.println("Updated Examinees list : " + examinees);
	        System.out.println("----------------------------------------------------------");
	    }
	
}
