package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_new;

import java.util.Scanner;

class FraudDetectorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of trader: ");
        String traderFullName = scanner.nextLine();
        System.out.print("Enter the city of trader: ");
        String traderCity = scanner.nextLine();
        System.out.print("Enter amount of transaction: ");
        int transactionAmount = Integer.parseInt(scanner.nextLine());

        Trader trader1 = new Trader(traderFullName, traderCity);
        Transaction transaction1 = new Transaction(trader1, transactionAmount);

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean isFraud = fraudDetector1.isFraud(transaction1);

        if (isFraud) {
            System.out.println("Fraud detected!!!");
        }
        else {
            System.out.println("Transaction completed!");
        }
    }
}
