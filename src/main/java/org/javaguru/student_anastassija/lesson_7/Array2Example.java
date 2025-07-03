package org.javaguru.student_anastassija.lesson_7;
//massiv celyh chisel

class Array2Example {

    public static void main(String[] args) {
        //objavlenie massiva nacinaetsja s vybora tipa dannyh: int, double, float, boolean
        int[] numbers = new int[5];//sozdanie massiva dlinoi 5 elementov
        //t.k eto massiv, to on dolzhen kak-to otlichatsja ot peremennoi, po-etomu ispolzuem [] skobki.
        //numbers - eto govorit o tom sto u nas etih chisel mnogo
        //v jave massiv javljaetsja objektom, po-etomu NEW
        //1. polozhim kakie-to znachenija v jachejki massiva

        numbers[0] = 10;//indeksy v massive nachinajutsja vsegda s nulja
        numbers[1] = 8;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = 243243;
        // potom mozhno izmenit znachenie, a staroe stiraetsja.

        numbers[0] = 652;
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
        System.out.println("Summa: " + sum);

        //mozhno vsegda uznat dlinu massiva
        System.out.println("Array size: " + numbers.length);

// massiv veshestvennyh cisel

        double[] prices = new double[10];
        prices[0] = 10.5;
        prices[1] = 10.5;

// massiv boolean cisel

        boolean[] yesNo = new boolean[100000]; // maksmimum cisel ot nulja do 2 v 31 stepeni.
        yesNo[0] = true;
        yesNo[1] = false;


    }
}
