package org.javaguru.student_anastassija.lesson_7;

class PrintNumbers2 {

    public static void main(String[] args) {
      /*
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }


    public void print() {*/
        int[] numbers = new int[10];
        numbers[4] = 4564;
        numbers[6] = 123;
        numbers[7] = 8;


        // i++ = i+1
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);//raspechataet ves massiv
        }
/*
        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i);
        }*/

    }
}