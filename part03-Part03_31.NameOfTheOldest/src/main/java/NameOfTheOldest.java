
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = -1;
        String name = "";
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            int value = Integer.valueOf(parts[1]);
            
            if (value > largest) {
                largest = value;
                name = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
