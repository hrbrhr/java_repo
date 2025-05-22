package org.javaguru.student_oleg_levashov.lesson_2.homework.level_3;

import java.util.Scanner;

class ArithmeticMean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double res = (double)(num1 + num2 + num3)/3;

        System.out.println("Среднее арифметическое трех чисел равно " + res);
    }

}
