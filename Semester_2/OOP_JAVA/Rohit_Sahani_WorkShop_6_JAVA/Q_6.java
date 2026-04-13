package Week_6;
import java.util.*;

public class Q_6 {
	public static void main(String[] args) {
		
	String sentence = "Hello World";
	System.out.println("Original Sentence: "+sentence);
	 
    Stack<String> wordStack = new Stack<>();
    for(String word : sentence.split(" ")) {
        wordStack.push(word);
       }
    System.out.print("Reversed Sentence: ");
    while(!wordStack.isEmpty()) {
        System.out.print(wordStack.pop() + " ");
       }
}
}
