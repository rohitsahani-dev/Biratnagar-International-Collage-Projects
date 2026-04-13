package Week_6;
import java.util.*;

public class Q_5 {
	public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();
        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");
        tasks.pop(); 
        tasks.push("Debug");
        tasks.push("Test");
        System.out.println("Top task (peek): " + tasks.peek());
        System.out.println("Current Stack: " + tasks);
}
}