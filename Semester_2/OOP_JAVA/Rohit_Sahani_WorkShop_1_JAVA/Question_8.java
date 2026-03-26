package Workshop1;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter radius of the cylinder:");
        double radius = obj.nextDouble();
        
        System.out.println("Enter height of the cylinder:");
        double height = obj.nextDouble();
        
        double vol = 3.14 * radius * radius * height;
        
        System.out.println("Volume of cylinder is " + vol);
        obj.close();
    }
}


