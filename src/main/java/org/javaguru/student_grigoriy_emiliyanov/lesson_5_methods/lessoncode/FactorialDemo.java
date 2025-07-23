package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.lessoncode;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(calcFactorialWithLoop(10));
        System.out.println();
        System.out.println(calcFactorialWithRecursion(10));
    }

    static long calcFactorialWithLoop(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
           result *= i ;
        }
        return result;
    }
    static long calcFactorialWithRecursion(int n) {
        if (n == 0) return 1;
        return n * calcFactorialWithRecursion(n - 1);
    }
}
