
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int endPoint = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int startingPoint = Integer.valueOf(scanner.nextLine());
        
        for (int i = startingPoint; i <= endPoint; i++ ) {
            System.out.println(i);
        }
    }
}
