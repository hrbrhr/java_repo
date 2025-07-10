package org.javaguru.student_anastassija.lesson_7.homework.Level_2;

class RandomIntArrayApp {

    public static void main(String[] args) {
        //создаётся массив целых чисел длиной 10,заполняется случайными числами в диапазоне от 0 до 100
        RandomIntArray randomIntArray = new RandomIntArray();
        int[] array = randomIntArray.createArrayAndFillIt();
        randomIntArray.printArray(array);//распечатывает массив

    }

}
