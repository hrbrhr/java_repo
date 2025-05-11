package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_14_plus;

import java.util.Locale;
import java.util.Scanner;

// Формула перевода Цельсия (°C) в Фаренгейт (°F):
//
// (Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C

class ConverterCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter temp in celsius: ");
        double celsius = scanner.nextDouble();
        double celsiusToFahrenheit = Math.round((celsius * 1.8d + 32) * 100) / 100.0d;
        System.out.println("Temp in fahrenheit: " + celsiusToFahrenheit);
    }
}
