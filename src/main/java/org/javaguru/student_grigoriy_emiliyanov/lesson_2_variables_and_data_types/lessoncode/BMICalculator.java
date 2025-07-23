package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Калькулятор BMI":
//        Напишите программу, которая запрашивает
//        у пользователя его вес (в килограммах) и рост
//        (в метрах), а затем вычисляет и выводит его
//        индекс массы тела (Body Mass Index, BMI).
//        Формула для расчета BMI: BMI = вес / (рост * рост).
class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kgs:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Body mass index (BMI) is " + bmi);
    }
}
