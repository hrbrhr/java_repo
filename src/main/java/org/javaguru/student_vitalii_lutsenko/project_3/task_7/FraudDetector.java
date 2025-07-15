package org.javaguru.student_vitalii_lutsenko.project_3.task_7;

class FraudDetector {

    boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        if (trader.getCity().equals("Sydney")) {
            return true;
        }
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        if (trader.getCountry().equals("Germany") && transaction.getAmount()>1000) {
            return true;
        }

        return false;
    }

   /* private boolean Rule1 (Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    */



}
