package week_8;

	import java.io.*;

	public class Q_4 {
	    public static void main(String[] args) {
	        int count = 0;

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	            	String[] words = line.split(" ");
	                count += words.length;
	            }

	            br.close();
	            System.out.println("Total words: " + count);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

