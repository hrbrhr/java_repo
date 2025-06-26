package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

interface FraudRule {

    boolean isFraud (Transaction transaction);
    String getRuleName ();
}
