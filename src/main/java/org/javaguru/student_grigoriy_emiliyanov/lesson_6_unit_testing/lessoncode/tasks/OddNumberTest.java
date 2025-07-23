package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.lessoncode.tasks;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.shouldBeOdd();
        test.shouldNotBeOdd();
    }

    public void shouldBeOdd() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(11);
        if (isOdd) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    public void shouldNotBeOdd() {
        OddNumber oddNumber = new OddNumber();
        boolean notOdd = !oddNumber.isOdd(12);
        if (notOdd) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
