package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.Scanner;

class FraudDetectorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of trader: ");
        String nameOfTrader = scanner.nextLine();
        System.out.print("Enter city of trader: ");
        String cityOfTrader = scanner.nextLine();
        System.out.print("Enter country of trader: ");
        String countryOfTrader = scanner.nextLine();
        System.out.print("Enter amount of transaction: ");
        int amountOfTransaction = scanner.nextInt();


        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader(nameOfTrader, cityOfTrader, countryOfTrader);
        Transaction transaction = new Transaction(trader, amountOfTransaction);
        boolean result = fraudDetector.isFraud(transaction);

        System.out.println("Transaction is fraud: " + result);
    }
}
