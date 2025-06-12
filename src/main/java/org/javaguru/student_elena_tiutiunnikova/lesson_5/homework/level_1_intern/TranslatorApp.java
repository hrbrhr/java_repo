package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_1_intern;

class TranslatorApp {
    public static void main(String[] args) {

        Translator translator1 = new Translator();
        int number1 = 8;
        if ((number1 % 3 == 0) && (number1 % 5 == 0)) {
            System.out.println("" + translator1.translator3(number1) + translator1.translator5(number1));
        } else if ((number1 % 3 == 0) ) {
            System.out.println("" + translator1.translator3(number1));
        } else {
            System.out.println("" + translator1.translator5(number1));
        }

        Translator translator2 = new Translator();
        int number2 = 45;
        if ((number2 % 3 == 0) && (number2 % 5 == 0)) {
            System.out.println("" + translator1.translator3(number2) + translator1.translator5(number2));
        } else if ((number2 % 3 == 0) ) {
            System.out.println("" + translator1.translator3(number2));
        } else {
            System.out.println("" + translator1.translator5(number2));
        }

        Translator translator3 = new Translator();
        int number3 = 9;
        if ((number3 % 3 == 0) && (number3 % 5 == 0)) {
            System.out.println("" + translator1.translator3(number3) + translator1.translator3(number3));
        } else if ((number3 % 3 == 0) ) {
            System.out.println("" + translator1.translator3(number3));
        } else {
            System.out.println("" + translator1.translator5(number3));
        }

        Translator translator4 = new Translator();
        int number4 = 10;
        if ((number4 % 3 == 0) && (number4 % 5 == 0)) {
            System.out.println("" + translator1.translator3(number4) + translator1.translator3(number4));
        } else if ((number4 % 3 == 0) ) {
            System.out.println("" + translator1.translator3(number4));
        } else {
            System.out.println("" + translator1.translator5(number4));
        }

    }

}
