package question2;



import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Converter Menu ---");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Currency Converter ---");
                    System.out.println("1. Dollar to GHC");
                    System.out.println("2. Euro to GHC");
                    System.out.println("3. Yen to GHC");
                    System.out.println("4. GHC to Dollar");
                    System.out.println("5. GHC to Euro");
                    System.out.println("6. GHC to Yen");
                    System.out.print("Enter your choice: ");
                    int currencyChoice = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();

                    switch (currencyChoice) {
                        case 1 -> System.out.println("Result: GHS " + CurrencyConverter.dollarToGhc(amount));
                        case 2 -> System.out.println("Result: GHS " + CurrencyConverter.euroToGhc(amount));
                        case 3 -> System.out.println("Result: GHS " + CurrencyConverter.yenToGhc(amount));
                        case 4 -> System.out.println("Result: $ " + CurrencyConverter.ghcToDollar(amount));
                        case 5 -> System.out.println("Result: € " + CurrencyConverter.ghcToEuro(amount));
                        case 6 -> System.out.println("Result: ¥ " + CurrencyConverter.ghcToYen(amount));
                    }
                    break;

                case 2:
                    System.out.println("\n--- Distance Converter ---");
                    System.out.println("1. Meter to Kilometer");
                    System.out.println("2. Miles to Kilometer");
                    System.out.println("3. Kilometer to Meter");
                    System.out.println("4. Kilometer to Miles");
                    System.out.print("Enter your choice: ");
                    int distanceChoice = scanner.nextInt();
                    System.out.print("Enter distance: ");
                    double distance = scanner.nextDouble();

                    switch (distanceChoice) {
                        case 1 -> System.out.println("Result: " + DistanceConverter.meterToKilometer(distance) + " km");
                        case 2 -> System.out.println("Result: " + DistanceConverter.milesToKilometer(distance) + " km");
                        case 3 -> System.out.println("Result: " + DistanceConverter.kilometerToMeter(distance) + " m");
                        case 4 -> System.out.println("Result: " + DistanceConverter.kilometerToMiles(distance) + " miles");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Time Converter ---");
                    System.out.println("1. Hours to Minutes");
                    System.out.println("2. Hours to Seconds");
                    System.out.println("3. Minutes to Hours");
                    System.out.println("4. Seconds to Hours");
                    System.out.print("Enter your choice: ");
                    int timeChoice = scanner.nextInt();
                    System.out.print("Enter time: ");
                    double time = scanner.nextDouble();

                    switch (timeChoice) {
                        case 1 -> System.out.println("Result: " + TimeConverter.hoursToMinutes(time) + " minutes");
                        case 2 -> System.out.println("Result: " + TimeConverter.hoursToSeconds(time) + " seconds");
                        case 3 -> System.out.println("Result: " + TimeConverter.minutesToHours(time) + " hours");
                        case 4 -> System.out.println("Result: " + TimeConverter.secondsToHours(time) + " hours");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}