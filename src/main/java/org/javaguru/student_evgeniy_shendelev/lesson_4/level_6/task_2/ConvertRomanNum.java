package org.javaguru.student_evgeniy_shendelev.lesson_4.level_6.task_2;

import java.util.Scanner;

class ConvertRomanNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 10");
        int num = scanner.nextInt();
        if(num < 1 || num > 10) {
            System.out.println("Ввели не верное число");
        }
        switch (num) {
            case 1 -> System.out.println("I");
            case 2-> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
        }

    }
}
