package org.javaguru.student_alexey_yakovlev.lesson_4.lessoncode;

class DiapazonNumber {

    public static void main(String[] args) {
        int number = 20;

        if ((number <= 1) || (number >= 10)) {
            System.out.println("Выполнится это условие в любом случае!");
        } else {
            System.out.println("Число не попадает в диапазон от 10 и более !");
        }
    }
}
