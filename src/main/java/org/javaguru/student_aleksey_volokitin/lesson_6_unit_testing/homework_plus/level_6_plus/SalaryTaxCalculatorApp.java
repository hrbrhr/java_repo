package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_6_plus;

import java.util.Scanner;

public class SalaryTaxCalculatorApp {
    public static void main(String[] args) {
        System.out.print("Enter salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double tax = calculator.calculate(salary);

        System.out.println("Tax = " + tax);
    }

}
