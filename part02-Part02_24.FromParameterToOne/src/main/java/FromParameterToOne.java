import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number:");
        int number = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(number);
    }

    public static void printFromNumberToOne(int number) {
        int i = 0;
        while(i < number) {
            System.out.println(number);
            number--;
        }
    }

}
