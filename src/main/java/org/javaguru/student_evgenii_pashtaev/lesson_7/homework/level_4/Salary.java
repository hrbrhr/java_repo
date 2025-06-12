package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_4;

public class Salary {

    public static void main(String[] args) {

        double [] arraySalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double middleSalary;
        double maxSalary = arraySalary[0];;
        double minSalary = arraySalary[0];;
        double sumSalary = 0;

        for (int i = 0; i < arraySalary.length; i++){
            sumSalary += arraySalary[i];

            if (maxSalary < arraySalary[i]){
                maxSalary = arraySalary[i];
            }

            if (minSalary > arraySalary[i]){
                minSalary = arraySalary[i];
            }
        }
        middleSalary = sumSalary / arraySalary.length;

        System.out.println("Middle salary = " + middleSalary);
        System.out.println("Maximum salary = " + maxSalary);
        System.out.println("Minimum salary = " + minSalary);
        System.out.println("All salary = " + sumSalary);
    }
}
