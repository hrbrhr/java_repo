package org.javaguru.student_evgeniy_shendelev.lesson_5.level_7.task_1;

public class DegreesConverterDemo {
    public static void main(String[] args) {
        System.out.printf("32,1 C = %.02f F\n", DegreesConverter.toFahrenheit(32.1));
        System.out.printf("32,1 F = %.02f C", DegreesConverter.toCelsius(32.1));
    }
}
