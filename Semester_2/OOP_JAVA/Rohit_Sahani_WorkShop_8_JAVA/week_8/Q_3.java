package week_8;

	import java.io.*;
	import java.util.*;

	public class Q_3 {

	    public static List<Integer> read(String filePath) {
	        List<Integer> numbers = new ArrayList<>();
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(filePath));
	            String line = br.readLine();

	            if (line != null) {
	                String[] parts = line.split(" ");
	                for (String p : parts) {
	                    numbers.add(Integer.parseInt(p));
	                }
	            }
	            br.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return numbers;
	    }

	    public static List<Integer> getEven(List<Integer> numbers) {
	        List<Integer> even = new ArrayList<>();
	        for (int n : numbers) {
	            if (n % 2 == 0) even.add(n);
	        }
	        return even;
	    }

	    public static List<Integer> getOdd(List<Integer> numbers) {
	        List<Integer> odd = new ArrayList<>();
	        for (int n : numbers) {
	            if (n % 2 != 0) odd.add(n);
	        }
	        return odd;
	    }

	    public static void write(List<Integer> numbers, String filePath) {
	        try {
	            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
	            for (int n : numbers) {
	                bw.write(n + " ");
	            }
	            bw.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        List<Integer> nums = read("numbers.txt");

	        write(getOdd(nums), "odd.txt");
	        write(getEven(nums), "even.txt");

	        System.out.println("Done separating numbers.");
	    }
	}
