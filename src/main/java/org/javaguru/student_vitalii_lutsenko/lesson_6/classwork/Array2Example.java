package org.javaguru.student_vitalii_lutsenko.lesson_6.classwork;

 class Array2Example {

    public static void main(String[] args) {

        int [] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 8;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = 1560;

        numbers[0] = 100;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int sum = numbers[0]
                + numbers[1]
                + numbers[2]
                + numbers[3]
                + numbers[4] ;
        System.out.println("Sum : " + sum);

        System.out.println(" ArraySize : " + numbers.length);


        double[] prices = new double[10];
        prices[0] = 10.5;
        prices[1] = 11.5;

        boolean[] yesNo = new boolean[10000];
        yesNo[0] = true;
        yesNo[1] = false;




    }
}
