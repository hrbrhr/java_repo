package org.javaguru.student_elena_tiutiunnikova.lesson_4.lessoncode;

import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество баллов:");
        int number = scanner.nextInt();

        if ((number>=90)&&(number<=100)) {
            System.out.println("A");
        } else if ((number>=80)&&(number<=89)) {
            System.out.println("B");}
            else if ((number>=70)&&(number<=79)) {
                System.out.println("C");}
                else if ((number>=60)&&(number<=69)) {
                    System.out.println("D");}
                    else  {
                        System.out.println("F");

        }
    }

}
