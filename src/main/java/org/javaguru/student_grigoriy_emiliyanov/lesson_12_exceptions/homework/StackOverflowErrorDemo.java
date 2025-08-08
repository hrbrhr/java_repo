package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        try {
            recursiveFunction();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void recursiveFunction() {
        recursiveFunction();
    }
}
