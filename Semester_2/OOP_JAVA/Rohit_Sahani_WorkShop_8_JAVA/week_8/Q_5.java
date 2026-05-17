package week_8;

	import java.io.*;
	import java.util.Scanner;

	class Student {
	    String firstName, lastName, address, contactNumber, semester;

	    public Student(String f, String l, String a, String c, String s) {
	        firstName = f;
	        lastName = l;
	        address = a;
	        contactNumber = c;
	        semester = s;
	    }

	    public String toCSV() {
	        return firstName + "," + lastName + "," + address + "," + contactNumber + "," + semester;
	    }
	}

	public class Q_5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("First Name: ");
	        String f = sc.nextLine();

	        System.out.print("Last Name: ");
	        String l = sc.nextLine();

	        System.out.print("Address: ");
	        String a = sc.nextLine();

	        System.out.print("Contact: ");
	        String c = sc.nextLine();

	        System.out.print("Semester: ");
	        String s = sc.nextLine();

	        Student st = new Student(f, l, a, c, s);

	        try {
	            BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv", true));
	            bw.write(st.toCSV());
	            bw.newLine();
	            bw.close();

	            System.out.println("Data written to CSV.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        sc.close();
	    }
	}

