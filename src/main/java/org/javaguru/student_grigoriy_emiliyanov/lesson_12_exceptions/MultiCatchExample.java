package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions;

class MultiCatchExample {
    public static void main(String[] args) {
        // First more tighten type of error must be caught
        try {
            int a = 123 / 0;
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic:");
            System.out.println(a.getMessage());
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }
    }
}
