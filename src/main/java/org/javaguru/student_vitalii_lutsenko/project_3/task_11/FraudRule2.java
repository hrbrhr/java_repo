package org.javaguru.student_vitalii_lutsenko.project_3.task_11;

class FraudRule2 implements FraudRule {

    @Override
     public boolean isFraud(Transaction transaction) {

        return (transaction.getAmount() > 1000000);
    }

}
