package week_8;

	import java.io.*;
	public class Q_2 {

	    public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("one.txt"));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("two.txt"));

	            String line;
	            while ((line = br.readLine()) != null) {
	                bw.write(line);
	                bw.newLine();
	            }

	            br.close();
	            bw.close();

	            System.out.println("File copied using BufferedReader/Writer.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

