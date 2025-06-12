package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_4_middle;

class SalaryTest {
    public static void main(String[] args) {
        SalaryTest test = new SalaryTest();
        test.testTotal();
        test.testTotalZero();
        test.testAverage();
        test.testAverageZero();
        test.testMin();
        test.testMin();
        test.testMax();
        test.testMaxZero();
        test.testSigma();
    }

    private void testForm (double realResult, double expectedResult, String testName) {
        if (Math.abs(realResult - expectedResult) < 0.001) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAIL");
        }
    }

    //    1000, 4550, 25000, 50000, 6000, 12000, 35000 -> 133550.0
    public void testTotal () {
        Salary salary = new Salary();
        double[] salary1 = {1000.0, 4550.0, 25000.0, 50000.0, 6000.0, 12000.0, 35000.0};
        double realResult = salary.totalSumSalary (salary1);
        testForm(realResult,
                133550.0,
                "Test Total Salary");
    }


    //    null -> 0.0
    public void testTotalZero () {
        Salary salary = new Salary();
        double[] salary1 = {};
        double realResult = salary.totalSumSalary (salary1);
        testForm(realResult,
                0.0,
                "Test Total Zero Salary");
    }

    //    1000, 4550, 25000, 50000, 6000, 12000, 35000 -> 19078.571
    public  void testAverage () {
        Salary salary = new Salary();
        double[] salary1 = {1000.0, 4550.0, 25000.0, 50000.0, 6000.0, 12000.0, 35000.0};
        double realResult = salary.averageSalary(salary1);
        testForm(realResult,
                19078.571,
                "Test Average Salary");
    }

    //    null -> 0.0
    public  void testAverageZero () {
        Salary salary = new Salary();
        double[] salary1 = {};
        double realResult = salary.averageSalary(salary1);
        testForm(realResult,
                0.0,
                "Test Average Zero Salary");
    }

    //    1000, 4550, 25000, 50000, 6000, 12000, 35000 -> 1000.0
    public  void testMin () {
        Salary salary = new Salary();
        double[] salary1 = {1000.0, 4550.0, 25000.0, 50000.0, 6000.0, 12000.0, 35000.0};
        double realResult = salary.minSalary(salary1);
        testForm(realResult,
                1000.000,
                "Test Minimal Salary");
    }


    //    null -> 0.0
        public  void testMinZero () {
            Salary salary = new Salary();
            double[] salary1 = {};
            double realResult = salary.minSalary(salary1);
            testForm(realResult,
                    0.0,
                    "Test Minimal Zero Salary");
        }

    //    1000, 4550, 25000, 50000, 6000, 12000, 35000 -> 50000.0
    public  void testMax () {
        Salary salary = new Salary();
        double[] salary1 = {1000.0, 4550.0, 25000.0, 50000.0, 6000.0, 12000.0, 35000.0};
        double realResult = salary.maxSalary(salary1);
        testForm(realResult, 50000.0, "Test Maximal Salary");
    }

    //    null -> 0.0
        public  void testMaxZero () {
            Salary salary = new Salary();
            double[] salary1 = {};
            double realResult = salary.maxSalary(salary1);
            testForm(realResult,
                    0.0,
                    "Test Maximal Zero Salary");
        }

    // sigma
        public void testSigma () {
            Salary salary = new Salary();
            double[] salary1 = {1000.0, 4550.0, 25000.0, 50000.0, 6000.0, 12000.0, 35000.0};
            double realResult = salary.sigma(salary1);
            testForm(realResult, 16918.9635, "Test Sigma Of Salary");
        }

}
