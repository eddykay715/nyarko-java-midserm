package question3;

import java.util.Scanner;

class Employee {
    protected String empName;
    protected int empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;

    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return 0.97 * basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    public double calculatePF() {
        return 0.12 * basicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    public double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateStaffClubFund();
    }

    public void displayPaySlip() {
        System.out.println("\n--- Pay Slip ---");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: GHS " + basicPay);
        System.out.println("DA: GHS " + calculateDA());
        System.out.println("HRA: GHS " + calculateHRA());
        System.out.println("PF: GHS " + calculatePF());
        System.out.println("Staff Club Fund: GHS " + calculateStaffClubFund());
        System.out.println("Gross Salary: GHS " + calculateGrossSalary());
        System.out.println("Net Salary: GHS " + calculateNetSalary());
    }
}
