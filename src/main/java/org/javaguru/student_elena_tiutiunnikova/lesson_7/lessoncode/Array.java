package org.javaguru.student_elena_tiutiunnikova.lesson_7.lessoncode;

class Array {
    public static void main(String[] args) {
        int [] numbers = new int [5];

        numbers [0] = 10;
        numbers [1] = 85;
        numbers [2] = 4;
        numbers [3] = 21;
        numbers [4] = 102;

        numbers [0] = 665;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int sum = numbers[0]
                + numbers[1]
                + numbers[2]
                + numbers[3]
                + numbers[4];
        System.out.println("Sum: " + sum);

        System.out.println("Array size: " + numbers.length);

        boolean [] yesNo = new boolean [100];
        yesNo [0] = true;
        yesNo [1] = false;

    }

}
