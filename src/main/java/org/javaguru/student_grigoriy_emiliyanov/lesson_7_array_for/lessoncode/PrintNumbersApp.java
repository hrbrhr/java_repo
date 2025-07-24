package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;

import java.util.Arrays;

class PrintNumbersApp {
    public static void main(String[] args) {
        PrintNumbers printer = new PrintNumbers();
        printer.print();
        System.out.println();
        System.out.println(Arrays.toString(printer.getRange(20, 30)));
        System.out.println(printer.getSum(1, 100));
    }
}
