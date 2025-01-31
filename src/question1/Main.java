package question1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Consumer No.: ");
    int consumerNo = scanner.nextInt();

    System.out.print("Enter Consumer Name: ");
    scanner.nextLine(); // Consume newline
    String consumerName = scanner.nextLine();

    System.out.print("Enter Previous Month Reading: ");
    double previousReading = scanner.nextDouble();

    System.out.print("Enter Current Month Reading: ");
    double currentReading = scanner.nextDouble();

    System.out.print("Enter Connection Type (domestic/commercial): ");
    String connectionType = scanner.next();

    ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
    bill.displayBill();

    scanner.close();
}
}
