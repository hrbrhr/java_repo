package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.lessoncode.tasks;

class MaxNumberTest {
    // number1 = 10; number2 = 20; result = 20
    // number1 = 20; number2 = 10; result = 20
    // number1 = 10; number2 = 10; result = 10

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.shouldBeNotEqualWhenAGreaterThanB();
        test.shouldBeNotEqualWhenALessThanB();
        test.shouldBeEqual();
    }

    private void shouldBeEqual() {
        MaxNumber maxNumber = new MaxNumber();
        int a = 10;
        int b = 10;
        if ((a == maxNumber.findMax(a, b)) && (b == maxNumber.findMax(a, b))) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void shouldBeNotEqualWhenALessThanB() {
        MaxNumber maxNumber = new MaxNumber();
        int a = 10;
        int b = 20;
        if (b == maxNumber.findMax(a, b)) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void shouldBeNotEqualWhenAGreaterThanB() {
        MaxNumber maxNumber = new MaxNumber();
        int a = 20;
        int b = 10;
        if (a == maxNumber.findMax(a, b)) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
