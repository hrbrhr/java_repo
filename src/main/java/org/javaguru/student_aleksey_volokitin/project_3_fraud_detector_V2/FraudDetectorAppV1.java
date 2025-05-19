package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

import java.util.Scanner;

class FraudDetectorAppV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name of trader: ");
        String traderFullName = scanner.nextLine().strip();
        System.out.print("Enter a city of trader: ");
        String traderCity = scanner.nextLine().strip();
        System.out.print("Enter a country of trader: ");
        String traderCountry = scanner.nextLine().strip();
        System.out.print("Enter amount of transaction: ");

        int transactionAmount = Integer.parseInt(scanner.nextLine().strip());

        Trader trader = new Trader(traderFullName, traderCity, traderCountry);
        Transaction transaction = new Transaction(trader, transactionAmount);

        FraudDetectorV1 fraudDetector = new FraudDetectorV1();
        boolean isFraud = fraudDetector.isFraud(transaction);

        if (isFraud) {
            System.out.println("Fraud detected!!!");
        }
        else {
            System.out.println("Transaction completed!");
        }
    }
}
