package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;

class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExampleTest suite = new ArrayExampleTest();
        suite.test1();
    }

    private void test1() {
        ArrayExample arrayExample = new ArrayExample();
        int size = 10;
        int[] actual = arrayExample.create(size);
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != 0) {
                System.out.println("TEST 1 FAIL");
                return;
            }
        }
        System.out.println("TEST 1 PASS");
    }
}
