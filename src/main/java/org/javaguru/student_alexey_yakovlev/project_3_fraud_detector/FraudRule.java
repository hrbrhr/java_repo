package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();
}
