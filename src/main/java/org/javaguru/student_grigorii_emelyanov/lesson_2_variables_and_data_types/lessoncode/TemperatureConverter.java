package org.javaguru.student_grigorii_emelyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Конвертер температур":
//        Напишите программу, которая преобразует температуру
//        в градусах Цельсия в градусы Фаренгейта и Кельвина.
//        Запросите у пользователя температуру в градусах
//        Цельсия и выведите результат в градусах Фаренгейта
//        и в градусах Кельвина.
// tF = 9/5 * tC + 32
// tK = tC + 273.15
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temperature in degree Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = 9 / 5.0 * celsius + 32;
        double kelvin = celsius + 273.15;

        System.out.println("The temperature in degree Fahrenheit is: " + fahrenheit);
        System.out.println("The temperature in degree Kelvin is: " + kelvin);
    }
}
