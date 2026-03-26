package Week_3;

public class Q_2 {
    public static void main(String[] args) {
        
        double[] numbers = {2.4, 5.2, 9.087, 34.0, 34.23};
        
        double sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}

