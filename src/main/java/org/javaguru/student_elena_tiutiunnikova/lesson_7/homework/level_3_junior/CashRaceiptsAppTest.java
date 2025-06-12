package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_3_junior;

class CashRaceiptsAppTest {
    public static void main(String[] args) {
        CashRaceiptsAppTest test = new CashRaceiptsAppTest();
        test.testTotal();
        test.testTotalZero();
        test.testAverage();
        test.testAverageZero();
    }

    private void testForm (double realResult, double expextedResult, String testName) {
        if (Math.abs(realResult - expextedResult) < 0.001) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAIL");
        }
    }

    public void testTotal () {
        CashReceipts[] cashReceipts = {
                new CashReceipts (1, 15.5), new CashReceipts (2, 30.0)};
                CashRaceiptsApp cashRaceiptsApp = new CashRaceiptsApp();
        double realResult = cashRaceiptsApp.totalSumOfCashReceipts(cashReceipts);
        testForm(realResult, 45.5,"Test Total Sum");
    }

    public void testTotalZero () {
        CashReceipts[] cashReceipts = {
                new CashReceipts (1, 0.0), new CashReceipts (2, 0.0)};
        CashRaceiptsApp cashRaceiptsApp = new CashRaceiptsApp();
        double realResult = cashRaceiptsApp.totalSumOfCashReceipts(cashReceipts);
        testForm(realResult, 0.0,"Test Total Sum Zero");
    }

    public void testAverage () {
        CashReceipts[] cashReceipts = {
                new CashReceipts (1, 15.5), new CashReceipts (2, 30.0)};
        CashRaceiptsApp cashRaceiptsApp = new CashRaceiptsApp();
        double realResult = cashRaceiptsApp.averageSumOfCashReceipts(cashReceipts);
        testForm(realResult, 22.750,"Test Total Average");
    }

    public void testAverageZero () {
        CashReceipts[] cashReceipts = {
                new CashReceipts (1, 0.0), new CashReceipts (2, 0.0)};
        CashRaceiptsApp cashRaceiptsApp = new CashRaceiptsApp();
        double realResult = cashRaceiptsApp.averageSumOfCashReceipts(cashReceipts);
        testForm(realResult, 0.0,"Test Total Average Zero");
    }
}
