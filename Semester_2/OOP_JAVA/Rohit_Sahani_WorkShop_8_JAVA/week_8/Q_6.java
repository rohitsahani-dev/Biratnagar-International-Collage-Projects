package week_8;

	import java.io.*;
	import java.util.*;

	public class Q_6 {
	    public static void main(String[] args) {
	        Map<String, Double> total = new HashMap<>();
	        Map<String, Integer> count = new HashMap<>();

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("products.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(";");

	                String product = parts[0];
	                double price = Double.parseDouble(parts[1]);

	
	                total.put(product, total.getOrDefault(product, 0.0) + price);

	          
	                count.put(product, count.getOrDefault(product, 0) + 1);
	            }
	            br.close();

	    
	            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));
	            bw.write("Product,Average");
	            bw.newLine();

	            for (String product : total.keySet()) {
	                double avg = total.get(product) / count.get(product);
	                bw.write(product + "," + avg);
	                bw.newLine();
	            }

	            bw.close();
	            System.out.println("Done.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

