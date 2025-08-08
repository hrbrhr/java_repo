package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        // NullPointerException is thrown when invoke method/attribute of variable pointing to null
        System.out.println(s.length());
    }
}
