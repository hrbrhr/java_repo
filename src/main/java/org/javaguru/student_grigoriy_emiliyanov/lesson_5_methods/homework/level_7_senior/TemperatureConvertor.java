package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_7_senior;

class TemperatureConvertor {
    public double convertFromCelsiusToFahrenheit(double celsius) {
        return (9 / 5.0 * celsius) + 32;

    }

    public double convertFromFahrenheitToCelsius(double fahrenheit) {
        return 5 / 9.0 * (fahrenheit - 32);
    }
}
