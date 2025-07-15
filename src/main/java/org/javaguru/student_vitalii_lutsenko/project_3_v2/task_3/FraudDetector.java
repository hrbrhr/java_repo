package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_3;

class FraudDetector {

    boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName().equals("Pokemon")) {
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
