package org.javaguru.student_vitalii_lutsenko.project_3.task_13;


class FraudRule1  implements FraudRule {

     @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

 }
