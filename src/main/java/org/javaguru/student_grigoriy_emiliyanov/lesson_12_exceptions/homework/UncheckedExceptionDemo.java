package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

class UncheckedExceptionDemo {
    public static void main(String[] args) {
        throwsUncheckedException();
    }

    private static void throwsUncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }
}
