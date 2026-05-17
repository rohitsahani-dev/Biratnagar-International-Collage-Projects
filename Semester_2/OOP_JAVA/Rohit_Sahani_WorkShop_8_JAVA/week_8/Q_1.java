package week_8;

	import java.io.*;
	public class Q_1 {

	    public static void main(String[] args) {
	        try {
	            BufferedInputStream file_1 = new BufferedInputStream(new FileInputStream("one.txt"));
	            BufferedOutputStream file_2 = new BufferedOutputStream(new FileOutputStream("two.txt"));

	            int data;
	            while ((data = file_1.read()) != -1) {
	            	file_2.write(data);
	            }

	            file_1.close();
	            file_2.close();

	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
