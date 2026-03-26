package Week_2;
import java.util.Scanner;
public class q_8 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the marks of the subjects to get the percentage and grade of the student ");
	        
	        System.out.print("Physics: ");
	        double phy = sc.nextDouble();
	        
	        System.out.print("Chemistry: ");
	        double chem = sc.nextDouble();
	        
	        System.out.print("Biology: ");
	        double bio = sc.nextDouble();
	        
	        System.out.print("Mathematics: ");
	        double math = sc.nextDouble();
	        
	        System.out.print("Computer: ");
	        double comp = sc.nextDouble();

	        double total = phy + chem + bio + math + comp;
	        double percent = (total / 500) * 100;

	        char grade;
	        if (percent >= 90) {
	            grade = 'A';
	        } else if (percent >= 80) {
	            grade = 'B';
	        } else if (percent >= 70) {
	            grade = 'C';
	        } else if (percent >= 60) {
	            grade = 'D';
	        } else if (percent >= 40) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("Percentage = " + percent + "%");
	        System.out.println("Grade = " + grade);
	        sc.close();
	    }
	}


