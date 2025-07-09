package org.javaguru.student_anastassija.lesson_7.homework.Level_4;

class Salary_Analyser {
    //общие расходы на зарплаты
    public double calculateTotalSalarySum(double[] salaries){
        double totalSalarySum = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            totalSalarySum += salaries[i];
        }
        return totalSalarySum;
    }
    //минимальную зарплату
    public double calculateMinSalary(double[] salaries){
        if (salaries.length == 0) {
            return 0.0;
        } else {
            double minSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                if (minSalary > salaries[i]) {
                    minSalary = salaries[i];
                }
            }
            return minSalary;
        }

        }
    //максимальную зарплату;
    public double calculateMaxSalary(double[] salaries){
        if (salaries.length == 0) {
            return 0.0;
        } else  {
            double maxSalary = salaries[0];
            for (int i = 1; i < salaries.length; i++){
                if (maxSalary < salaries[i]){
                    maxSalary = salaries[i];
                }
            }
            return  maxSalary;
        }
}
    //среднюю зарплату
    public double calculateAvarageSalary(double[] salaries){
        double totalSalary = calculateTotalSalarySum(salaries);
        if (salaries.length == 0){
            return  0.0;
        } else {
            return totalSalary / salaries.length;

            }
        }
    }


