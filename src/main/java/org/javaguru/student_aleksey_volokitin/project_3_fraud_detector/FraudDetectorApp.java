package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector;

class FraudDetectorApp {
    public static void main(String[] args) {

        Trader trader1 = new Trader("Aleks", "Chita");
        Transaction transaction1 = new Transaction(trader1, 1000);

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
