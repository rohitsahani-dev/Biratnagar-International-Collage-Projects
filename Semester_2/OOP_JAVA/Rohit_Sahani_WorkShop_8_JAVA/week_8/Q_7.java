package week_8;

	import java.io.*;
	public class Q_7 {

	    public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("students.csv"));

	            String headerLine = br.readLine();
	            String[] headers = headerLine.split(",");

	            BufferedWriter[] writers = new BufferedWriter[headers.length];

	            for (int i = 0; i < headers.length; i++) {
	                writers[i] = new BufferedWriter(new FileWriter(headers[i].trim() + ".txt"));
	            }

	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");

	                for (int i = 0; i < values.length; i++) {
	                    writers[i].write(values[i].trim());
	                    writers[i].newLine();
	                }
	            }

	            for (BufferedWriter bw : writers) {
	                bw.close();
	            }

	            br.close();

	            System.out.println("Files created successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	   }
}

