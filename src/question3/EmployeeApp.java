package question3;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Mobile No.: ");
        String mobileNo = scanner.nextLine();

        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();

        System.out.println("\nSelect Employee Type:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Employee employee;
        switch (choice) {
            case 1:
                employee = new Programmer(name, id, address, email, mobileNo, basicPay);
                break;
            case 2:
                employee = new AssistantProfessor(name, id, address, email, mobileNo, basicPay);
                break;
            case 3:
                employee = new AssociateProfessor(name, id, address, email, mobileNo, basicPay);
                break;
            case 4:
                employee = new Professor(name, id, address, email, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        employee.displayPaySlip();
        scanner.close();
    }
}
