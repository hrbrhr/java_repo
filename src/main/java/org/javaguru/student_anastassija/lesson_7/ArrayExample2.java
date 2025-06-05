package org.javaguru.student_anastassija.lesson_7;

class ArrayExample2 { // massiv celyh cisel

    public static void main(String[] args) {
        int arraySize = 5;  //scanner.net.in vmesto 5.

        int[] numbers = new int [arraySize];

        numbers[0] = 10; //indeks 0, nachinaetsja s nulja. Sohranjaetsja v jacejku v kvadratnyh skobkah
        numbers[1] = 8;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = 243243;

        numbers[0] = 665;//mozhem pomenjat znacenie, staroe udaljaetsja, novoe zapisyvaetsja
        int sum = numbers[0]
                + numbers[1]
                + numbers[2]
                + numbers[3]
                + numbers[4];
        System.out.println(numbers[0]); // vyvodit znachenie nashih jacheek
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println("sum: " + sum);

        //specificeskoe svoistvo length
        System.out.println("Array size: "
                + numbers.length); //vydajot celoe cislo, kakogo razmera nsh massiv. Berjotsja iz
                                    //[arraySize]


        //massiv veshestvennyh cisel
        double[] prices = new double[10];
        prices[0] = 10.5;
        prices[1] = 10.5;

        //massiv boolean
        boolean[] yesNo  = new boolean[100000];
        yesNo [0] = true;
        yesNo [1] = false;

    }
}
