package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_7_plus.task_1_plus;

class Converter {
    // Формула перевода Фаренгейта (°F) в Цельсий (°C) и наоборот Цельсия (°C) в Фаренгейт (°F):
    //
    // (Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C
    //  Цельсий х 1,8 + 32 = Фаренгейт  Пример: 10°C x 1,8 + 32 = 50°F

    double fahrenheitToCelsius(double fahrenheit) {
        return Math.round(((fahrenheit - 32) / 1.8) * 100) / 100.0d;
    }
    double celsiusToFahrenheit(double celsius) {
        return Math.round((celsius * 1.8d + 32) * 100) / 100.0d;
    }
}
