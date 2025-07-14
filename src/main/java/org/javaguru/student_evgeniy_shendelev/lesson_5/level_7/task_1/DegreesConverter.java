package org.javaguru.student_evgeniy_shendelev.lesson_5.level_7.task_1;

class DegreesConverter {
    static double toFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    static double toCelsius(double fahrenheit) {
        return (5.0/9) * (fahrenheit - 32);
    }
}
