package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.lessoncode.tasks;


class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.shouldReturnTrueWhenEvent();
        test.shouldReturnTrueWhenZero();
        test.shouldReturnFalseWhenOdd();
    }

    private void shouldReturnTrueWhenZero() {
        EvenNumber evenNumber = new EvenNumber();
        if (evenNumber.isEven(0)) {
            System.out.println("Test OK: " + "should return true when zero");
        } else {
            System.out.println("Test FAIL: " + "should return true when zero");
        }
    }

    private void shouldReturnFalseWhenOdd() {
        EvenNumber evenNumber = new EvenNumber();
        int odd = 5;
        if (!evenNumber.isEven(odd)) {
            System.out.println("Test OK: " + "should return false when odd");
        } else {
            System.out.println("Test FAIL: " + "should return false when odd");
        }
    }

    private void shouldReturnTrueWhenEvent() {
        EvenNumber evenNumber = new EvenNumber();
        int even = 4;
        if (evenNumber.isEven(even)) {
            System.out.println("Test OK: " + "should return true when even");
        } else {
            System.out.println("Test FAIL: " + "should return true when even");
        }
    }
}
