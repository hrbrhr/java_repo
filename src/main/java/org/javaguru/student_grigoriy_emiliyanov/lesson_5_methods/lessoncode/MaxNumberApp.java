package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.lessoncode;

public class MaxNumberApp {
    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();
        int n1 = 2;
        int n2 = 4;
        int n3 = -1;
        System.out.println("Max of " + n1 + " and " + n2 + " is " + maxNumber.findMax(n1, n2));
        System.out.println("Max of " + n1 + " and " + n3 + " is " + maxNumber.findMax(n1, n3));
        System.out.println("Max of " + n1 + " and " + n2 + " and " + n3 + " is " + maxNumber.findMax(n1, n2, n3));
    }
}
