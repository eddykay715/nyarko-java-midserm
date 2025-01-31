package question1;

import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType.toLowerCase();
    }

    public double calculateBill() {
        double units = currentReading - previousReading;
        double bill = 0;

        if (connectionType.equals("domestic")) {
            if (units <= 100) {
                bill = units * 1;
            } else if (units <= 200) {
                bill = 100 * 1 + (units - 100) * 2.5;
            } else if (units <= 500) {
                bill = 100 * 1 + 100 * 2.5 + (units - 200) * 4;
            } else {
                bill = 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
            }
        } else if (connectionType.equals("commercial")) {
            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = 100 * 2 + (units - 100) * 4.5;
            } else if (units <= 500) {
                bill = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
            } else {
                bill = 100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7;
            }
        }

        return bill;
    }

    public void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Bill Amount: GHS " + calculateBill());
    }
}

