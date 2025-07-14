package org.javaguru.student_evgeniy_shendelev.lesson_5.level_1.task_1;

class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 51; i++) {
            System.out.println(i + ": " + fizzBuzz.detect(i));
        }
    }
}
