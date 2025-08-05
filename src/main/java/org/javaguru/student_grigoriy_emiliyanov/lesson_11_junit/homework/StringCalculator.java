package org.javaguru.student_grigoriy_emiliyanov.lesson_11_junit.homework;

class StringCalculator {
    int add(String numbers) {
        if (numbers.isBlank()) return 0;
        String[] args = numbers.split("[,]");
        int result = 0;
        for (String n : args) {
            result += Integer.parseInt(n);
        }
        return result;
    }


}
