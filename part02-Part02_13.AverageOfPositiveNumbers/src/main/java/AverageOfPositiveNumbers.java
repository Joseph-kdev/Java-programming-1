
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int totalNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (totalNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            } else if (number > 0) {
                totalNumbers += 1;
                sum += number;
            } 
            
        }
        double average = (double) sum / totalNumbers;
        System.out.println(average);

    }
}
