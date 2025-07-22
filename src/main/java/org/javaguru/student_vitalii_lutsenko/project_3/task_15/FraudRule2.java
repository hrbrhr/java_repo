package org.javaguru.student_vitalii_lutsenko.project_3.task_15;

class FraudRule2 implements FraudRule {

    @Override
     public boolean isFraud(Transaction transaction) {

        return (transaction.getAmount() > 1000000);
    }

    @Override
    public String getRuleName(){
        return "FraudRule2";
    }

}
