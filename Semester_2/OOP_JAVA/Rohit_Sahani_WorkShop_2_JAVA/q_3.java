
	package Week_2;
	import java.util.Scanner;
	public class q_3 {
		public static void main(String[] args) {
			Scanner Obj = new Scanner(System.in);
			System.out.println("Enter the grade of the student : ");
			double grade = Obj.nextDouble();
			
			if(grade>=90 && grade<=100) {
			System.out.print("A+");
			}else if(grade>=80 && grade<90) {
				System.out.print("A");
			}else if(grade>=80 && grade<90) {
				System.out.print("B+");
			}else if(grade>=70 && grade<80) {
				System.out.print("B");
			}else if(grade>=60 && grade<70) {
				System.out.print("C+");
			}else if(grade>=50 && grade<60) {
				System.out.print("C");
			}else {
				System.out.print("Failed");
			}
			Obj.close();
			}
		
		
		}
	

