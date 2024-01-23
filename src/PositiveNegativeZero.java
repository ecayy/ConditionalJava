import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number = s.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("0");
        }
    }
}