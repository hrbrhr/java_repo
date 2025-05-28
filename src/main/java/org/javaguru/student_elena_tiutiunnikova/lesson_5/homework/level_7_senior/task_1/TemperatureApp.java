package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_7_senior.task_1;

class TemperatureApp {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        int temperatureCelsius1 = 24;
        System.out.println("Если температура в Цельсиях составляет " + temperatureCelsius1 + ", то в Фаренгейтах это будет: "
                + temperature.converterCelsiusToFahrenheit(temperatureCelsius1));

        int temperatureFahrenheit1 = 60;
        System.out.println("Если температура в Фаренгейтах составляет " + temperatureFahrenheit1 + ", то в Цельсиях это будет: "
                + temperature.converterFahrenheitToCelsius(temperatureFahrenheit1));
    }
}
