
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int totalNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            totalNumbers += 1;
            sum += number;
        }
        System.out.println("Number of numbers: " + totalNumbers); 
        System.out.println("Sum of the numbers: " + sum);

    }
}
