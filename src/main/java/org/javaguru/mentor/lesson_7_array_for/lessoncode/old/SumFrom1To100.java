package org.javaguru.mentor.lesson_7_array_for.lessoncode.old;

class SumFrom1To100 {

    public int sumOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // beginNumber, endNumber
    // from, to
    // startNumber, endNumber

    public int sumOfNumbers(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }
        return sum;
    }


}
