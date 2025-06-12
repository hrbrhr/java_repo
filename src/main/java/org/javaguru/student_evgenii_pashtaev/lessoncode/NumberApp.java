package org.javaguru.student_evgenii_pashtaev.lessoncode;

class NumberApp {
    public static void main(String[] args) {

         Number numb = new Number();
         int number1 = 1;
         int number2 = 1;
         int number3 = 3;

        System.out.println(numb.isEven(number1));
        System.out.println(numb.isEven(number2));
        System.out.println(numb.isEven(number3));

        System.out.println(numb.isOdd(number1));
        System.out.println(numb.isOdd(number2));
        System.out.println(numb.isOdd(number3));

        System.out.println(numb.getMiddle(number1, number2));
        System.out.println(numb.getMax(number1, number2));
        System.out.println(numb.getMaxTree(1, 2, 3));
        System.out.println(numb.getMaxTree(2, 2, 3));
        System.out.println(numb.getMaxTree(1, 2, 1));
        System.out.println(numb.getMaxTree(3, 2, 1));
        System.out.println(numb.getMaxTree(2, 2, 2));
        System.out.println(numb.getMaxTreeV3(1, 2, 3));
        System.out.println(numb.getMaxTreeV3(3, 2, 1));
    }
}
