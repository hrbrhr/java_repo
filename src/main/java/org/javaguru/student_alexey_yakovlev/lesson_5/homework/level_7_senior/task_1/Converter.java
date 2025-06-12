package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_7_senior.task_1;

class Converter {

    double fromCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
