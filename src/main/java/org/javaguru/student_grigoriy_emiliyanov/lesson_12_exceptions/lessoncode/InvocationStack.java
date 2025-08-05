package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.lessoncode;

class InvocationStack {

    public static void main(String[] args) {
        System.out.println("main before");
        m1();
        System.out.println("main after");
    }

    public static void m1() {
        System.out.println("m1 before");
        m2();
        System.out.println("m1 after");
    }

    public static void m2() {
        System.out.println("m2 before");
        int abc = 0;
        m3(abc);
        System.out.println("m2 after");
    }

    public static void m3(int abc) {
        try {
            System.out.println("m3 before");
            if (abc == 0) {
                ArrayException arrayException =
                        new ArrayException(
                                3,
                                3,
                                "Array index out of bounds"
                        );
                throw arrayException;
            }
            System.out.println("m3 after");
        } catch (ArrayException e) {
            System.out.println("EXCEPTION CATCHED!!!");
            System.out.println("index = " + e.getArrayIndex());
            System.out.println("size = " + e.getArraySize());
            System.out.println("message = " + e.getErrorMessage());
        }
    }

}
