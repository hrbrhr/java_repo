package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_7_senior.task_1;

class Temperature {
    public double converterCelsiusToFahrenheit (int temperatureCelsius) {
        return ((temperatureCelsius * (9.0/5.0)) + 32);
    }

    public double converterFahrenheitToCelsius (int temperatureFahrenheit) {
        return ((temperatureFahrenheit - 32) * (5.0/9.0));
    }

}
