package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_9_plus;

class FindCountDigits {
    public int countDigits(int number) {
        if (number < 0) {
            number = -number;  // Учитываем отрицательные числа
        }
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }
}
