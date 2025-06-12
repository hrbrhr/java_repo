package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_9_plus;

class FindSumNumbers {
    public int sumNumbers(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        if (number == 1) {
            return 1;
        }
        return number + sumNumbers(number - 1);
    }
}
