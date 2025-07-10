package org.javaguru.student_anastassija.lesson_7.homework.Level_3;

class CashReceiptCalculatorTest {
    public static void main(String[] args) {
       CashReceiptCalculatorTest test = new CashReceiptCalculatorTest();//zapusk testov

        test.test1();//Должен вернуть 0.0, если чеков нет /calculateTotalSum
        test.test2();//Должен вернуть общую сумму продаж /calculateTotalSum
        test.test3();//должен вернуть нулевую среднюю сумму продаж /calculateAverageSum
        test.test4();//должен вернуть среднюю сумму продаж/ calculateAverageSum
    }

    public void test1() {
        CashReceipt[] receipts = {};//Создаётся пустой массив чеков (нет ни одного чека).
        CashReceiptCalculator calculator = new CashReceiptCalculator();//Создаётся объект CashReceiptCalculator, чтобы вызвать его методы.

        double totalSum = calculator.calculateTotalSum(receipts);
        if (totalSum == 0.0){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FALSE");
        }
       /* //teper sravnivaem to, sto poluchili s tem, sto ozidali
        checkResult(totalSum, 0.0, "shouldReturnZeroTotalSalesSum");*/
    }

    public void test2() {
        CashReceipt[] receipts = {//Создаётся массив чеков
                new CashReceipt("Receipt number 1", 1.5),
                new CashReceipt("Receipt number 2", 5.5),
        };
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double totalSum = calculator.calculateTotalSum(receipts);
        if (totalSum == 7.0){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }

    public void test3() {
      CashReceipt[] receipts = {};//Создаётся пустой массив чеков
       CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageSum(receipts);
        if (averageReceiptSum == 0.0){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FALSE");
        }
    }

    public void test4() {
        CashReceipt[] receipts = {
                new CashReceipt("N1", 1.0),
                new CashReceipt("N1", 3.0),
        };
       CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageSum(receipts);
        if (averageReceiptSum == 2.0){
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FALSE");
        }
    }
}
