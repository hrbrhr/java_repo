package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_12_plus;

import java.util.Locale;
import java.util.Scanner;

// Формула для расчета BMI: BMI = вес / (рост * рост)

class CalculatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter your weight in the kilograms: ");
        double weightInKilograms = scanner.nextDouble();
        System.out.print("Enter your height in the meters: ");
        double heightInMeters = scanner.nextDouble();
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your BMI: " + bmi);
    }
}
