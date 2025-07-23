package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_7_senior;

class TemperatureConvertorDemo {
    public static void main(String[] args) {
        TemperatureConvertor convertor = new TemperatureConvertor();
        System.out.println("Celsius 36.6, fahrenheit = "
                + convertor.convertFromCelsiusToFahrenheit(36.6));
        System.out.println("Fahrenheit 100.0, celsius = "
                + convertor.convertFromFahrenheitToCelsius(100.0));
    }
}
