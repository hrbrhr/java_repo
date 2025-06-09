package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_3_junior;

class CashRaceiptsApp {

       double totalSumOfCashReceipts (CashReceipts[] receipts) {
            double totalSum = 0.0;
            for (int i = 0; i < receipts.length; i++) {
                CashReceipts receipt = receipts [i];
                totalSum = totalSum + receipt.getSum();
            }
            return totalSum;
    }

    double averageSumOfCashReceipts (CashReceipts[] receipts) {
        double averageSum = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipts receipt = receipts [i];
            averageSum = totalSumOfCashReceipts(receipts) / receipts.length;
        }
        return averageSum;
    }

}
