package org.javaguru.student_vitalii_lutsenko.project_3.task_8;

class FraudDetector {

    boolean isFraud (Transaction transaction) {
        return isFraudRule1(transaction)
                || isFraudRule2(transaction)
                || isFraudRule3(transaction)
                || isFraudRule4(transaction)
                || isFraudRule5(transaction);
    }


       /* Trader trader = transaction.getTrader();
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
        return false;
    }*/

    private boolean isFraudRule1 (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }
    private boolean isFraudRule2 (Transaction transaction) {
        return (transaction.getAmount() > 1000000);
    }
    private boolean isFraudRule3 (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return (trader.getCity().equals("Sydney"));
    }
    private boolean isFraudRule4 (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return (trader.getCountry().equals("Jamaica"));
    }
    private boolean isFraudRule5 (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return(trader.getCountry().equals("Germany") && transaction.getAmount()>1000);
    }









}
