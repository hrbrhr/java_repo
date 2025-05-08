package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_7_plus.task_1_plus;

import java.util.Locale;
import java.util.Scanner;

class FahrenheitCelsiusApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // - для вещественных чисел с российскими региональными стандартами
        System.out.print("Enter a temperature in the fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.print("Enter a temperature in the celsius: ");
        double celsius = scanner.nextDouble();

        Converter converter = new Converter();
        String result = "Fahrenheit: " + fahrenheit + ", celsius: " + converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(result);
        result = "Celsius: " + celsius + ", fahrenheit: " + converter.celsiusToFahrenheit(celsius);
        System.out.println(result);
    }
}
