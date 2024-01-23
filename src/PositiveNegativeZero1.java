import java.util.Scanner;

public class PositiveNegativeZero1 {
    public static void checkNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close the Scanner to prevent resource leak
        s.close();
    }

    public static void main(String[] args) {
        checkNumber();
    }
}
