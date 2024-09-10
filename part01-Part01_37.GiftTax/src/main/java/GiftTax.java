
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int giftValue = Integer.valueOf(scan.nextLine());

        if (giftValue >= 0 && giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            double tax = 100 + (double) (giftValue - 5000)* 0.08;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            double tax = 1700 + (double) (giftValue - 25000) * 0.1;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            double tax = 4700 + (double) (giftValue - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            double tax = 22100 + (double) (giftValue - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 1000000) {
            double tax = 142100 + (double) (giftValue - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        }

    }
}
