
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> years = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] values = input.split(",");
            
            names.add(values[0]);
            years.add(Integer.valueOf(values[1]));
         
        }
        
        //find longest name
        String longestName = "";
        int longestNameLen = longestName.length();
        
        for(String word : names) {
            if(word.length() > longestNameLen) {
                longestName = word;
                longestNameLen = word.length();
            }
        }
        System.out.println("Longest name: " + longestName);
        
        //find average
        
        int sum = 0;
        
        for(int value : years) {
            sum+=value;
        }
        System.out.println("Average of the birth years: " + (double)sum / years.size());
    }
}
