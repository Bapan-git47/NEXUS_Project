import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        double exchangeRate = 1.18; // Example exchange rate (1 USD to EUR)
        double convertedAmount = convertCurrency(usdAmount, exchangeRate);

        System.out.println(usdAmount + " USD is equal to " + convertedAmount + " EUR");
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
