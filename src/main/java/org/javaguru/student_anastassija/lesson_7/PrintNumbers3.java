package org.javaguru.student_anastassija.lesson_7;

class PrintNumbers3 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 888;
        numbers[4] = 32564;
        numbers[7] = 1256;
        numbers[8] = 3;
        numbers[9] = 5698;


        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public void print() {
        int[] numbers = new int[10];

        // i++ = i+1
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i);
        }

    }
}