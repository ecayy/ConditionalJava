import java.util.Scanner;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1; // indicating invalid input
        }

        // 1 mile is approximately equal to 1.60934 kilometers
        double milesPerHour = kilometersPerHour / 1.60934;

        // Round the calculated miles per hour and return as long
        return Math.round(milesPerHour);
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for km: ");

        if (scanner.hasNextDouble()) {
            double kilometers = scanner.nextDouble();
            long miles = toMilesPerHour(kilometers);
            System.out.println(kilometers + " kilometers per hour is approximately " + miles + " miles per hour.");
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
