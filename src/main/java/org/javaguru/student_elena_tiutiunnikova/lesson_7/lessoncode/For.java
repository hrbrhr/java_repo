package org.javaguru.student_elena_tiutiunnikova.lesson_7.lessoncode;

class For {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers [1] = 5656;
        numbers [5] = 102154;
        numbers [9] = 5245;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }

//        for (int i = 0; i <= 100; i = i+2) {
//            System.out.println(i);
//        }

    }
}
