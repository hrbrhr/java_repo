package org.javaguru.student_anastassija.lesson_7.homework.Level_4;

class Salary_AnalyserTest {

    public static void main(String[] args) {
        Salary_AnalyserTest test = new Salary_AnalyserTest();//zapusk testov

        test.test1();//общие расходы на зарплаты f
        test.test2();//минимальную зарплатуff
        test.test3();//максимальную зарплату
        test.test4();//среднюю зарплату
        test.test5();//общие расходы 0
        test.test6();//минимальную зарплату 0
        test.test7();//максимальную зарплату 0
        test.test8();//среднюю зарплату 0
        /*(пример: {2500.0, 3200.0, 1800.0, 4000.0, 2900.0}).*/
    }

    public void test1(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double totalSalarySum = salary_Analyser.calculateTotalSalarySum(salaries);
        if (totalSalarySum == 14400.0){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FALSE");
    }
    }

    public void test2(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double minSalary = salary_Analyser.calculateMinSalary(salaries);
        if (minSalary == 1800.0){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }

    public void test3(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double maxSalary = salary_Analyser.calculateMaxSalary(salaries);
        if (maxSalary == 4000.0){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FALSE");
        }
    }

    public void test4(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double avarageSalary = salary_Analyser.calculateAvarageSalary(salaries);
        if (avarageSalary == 2880.0){
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FALSE");
        }
    }
    public void test5(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {};
        double totalSalarySum = salary_Analyser.calculateTotalSalarySum(salaries);
        if (totalSalarySum == 0.0){
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FALSE");
        }
    }

    public void test6(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {};
        double minSalary = salary_Analyser.calculateMinSalary(salaries);
        if (minSalary == 0.0){
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FALSE");
        }
    }

    public void test7(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {};
        double maxSalary = salary_Analyser.calculateMaxSalary(salaries);
        if (maxSalary == 0.0){
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FALSE");
        }
    }

    public void test8(){
        Salary_Analyser salary_Analyser = new Salary_Analyser();
        double[] salaries = {};
        double avarageSalary = salary_Analyser.calculateAvarageSalary(salaries);
        if (avarageSalary == 0.0){
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FALSE");
        }
    }

}
