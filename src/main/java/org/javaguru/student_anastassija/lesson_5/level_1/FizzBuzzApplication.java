package org.javaguru.student_anastassija.lesson_5.level_1;

public class FizzBuzzApplication {

    public static void main(String[] args) {

        FizzBuzz numberToLine = new FizzBuzz();

        System.out.println("Number 9 = " + numberToLine.detect(9));
        System.out.println("Number 15 = " + numberToLine.detect(15));
        System.out.println("Number 90 = " + numberToLine.detect(90));
        System.out.println("Number 15 = " + numberToLine.detect(51));
        System.out.println("Number 56 = " + numberToLine.detect(56));


    }
}
