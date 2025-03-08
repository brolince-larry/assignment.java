import java.text.NumberFormat; // For formatting the mortgage amount in currency format
import java.util.Scanner; // For user input

public class Mortgage {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12; // Constant for months in a year
        final byte PERCENT = 100;       // Constant for percentage conversion

        Scanner scanner = new Scanner(System.in); // Scanner object for user input

        // Get the loan principal amount from the user
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Get the annual interest rate and convert it to a monthly interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Get the loan period in years and convert it to months
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Mortgage formula implementation
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Formatting the mortgage amount to display as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
