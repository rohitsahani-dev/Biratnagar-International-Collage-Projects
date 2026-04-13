package Week_6;
import java.util.*;

public class Q_10 {
	public static void main(String[] args) {
	        HashMap<String, String> contacts = new HashMap<>();

	        contacts.put("Rohit", "9841234567");
	        contacts.put("Aayush", "9801122334");
	        contacts.put("Yukash", "9815566778");

	        System.out.println("Aayush's Phone: " + contacts.get("Aayush"));

	        System.out.println("\nAll Contacts:");
	        for (String name : contacts.keySet()) {
	            System.out.println("Name: " + name + " | Phone: " + contacts.get(name));
	        }
	    }
}
