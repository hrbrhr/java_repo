package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_7_senior.task_1;

class ConverterApp {

    public static void main(String[] args) {
        Converter converter = new Converter();

        double celsius = 20;
        double fahrenheit = 68;

        System.out.println("Celsius 20 this is Fahrenheit = " + converter.fromCelsiusToFahrenheit(celsius));
        System.out.println("Fahrenheit 68 this is Celsius = " + converter.fromFahrenheitToCelsius(fahrenheit));

    }
}
