package lab7;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example currencies
        Currency usd = new Currency("USD", 1.25);
        Currency eur = new Currency("EUR", 1.15);
        Currency jpy = new Currency("JPY", 180.0);

        // Ask user for customer info
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();

        System.out.print("Is VIP? (true/false): ");
        boolean isVip = scanner.nextBoolean();

        Customer customer = new Customer(age,name , isVip);

        // Ask for amount to exchange
        System.out.print("Enter GBP amount to exchange: £");
        double gbpAmount = scanner.nextDouble();

        // Ask for currency choice
        System.out.println("Choose currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        int choice = scanner.nextInt();

        Currency selectedCurrency;
        switch(choice) {
            case 1 -> selectedCurrency = usd;
            case 2 -> selectedCurrency = eur;
            case 3 -> selectedCurrency = jpy;
            default -> {
                System.out.println("Invalid choice, defaulting to USD.");
                selectedCurrency = usd;
            }
        }

        // Process transaction
        ExchangeTransaction transaction = new ExchangeTransaction(customer, selectedCurrency, gbpAmount);
        transaction.processTransaction();

        scanner.close();
    }
}
