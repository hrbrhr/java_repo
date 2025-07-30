package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_6;

public class VarArgsDemo {
    public static void main(String[] args) {
        VarArgsDemo varArgsDemo = new VarArgsDemo();
        varArgsDemo.print(1, 2, 3);
        varArgsDemo.print(1, 2, 3, 4, 5, 6);
    }

    public void print(int ... args) {
        for (int s : args) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }
}
