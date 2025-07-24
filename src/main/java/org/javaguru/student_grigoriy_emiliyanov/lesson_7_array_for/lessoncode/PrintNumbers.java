package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;


class PrintNumbers {
    public void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public int[] getFirstTen() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public int[] getRange(int from, int to) {
        int[] array = new int[to - from + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + i;
        }
        return array;
    }

    public int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
