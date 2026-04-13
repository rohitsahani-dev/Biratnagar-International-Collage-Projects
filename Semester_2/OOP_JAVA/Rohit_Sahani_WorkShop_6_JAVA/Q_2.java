package Week_6;
import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        System.out.println("Is list empty? " + list.isEmpty());
        list.addFirst(10);
        list.addLast(20);
        System.out.println("List whare we have added 2 values : " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
}
}