
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) { // Check for empty input to break the loop
                break;
            }
            String[] words = input.split("\\s+"); // Split input on spaces
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}

