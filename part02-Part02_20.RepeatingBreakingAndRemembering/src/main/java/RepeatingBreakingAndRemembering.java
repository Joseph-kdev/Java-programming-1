
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int numOfNumbers = 0;
        double average = 0;
        int evenNums = 0;
        int oddNums = 0;
        
        System.out.println("Give numbers:");
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                total+= number;
                numOfNumbers += 1;
                average = (double) total / numOfNumbers;
            }
            
            if (number % 2 == 0) {
                evenNums += 1;
            } else {
                oddNums += 1;
            }
            
        }
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + numOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);
        
        
    }
}
