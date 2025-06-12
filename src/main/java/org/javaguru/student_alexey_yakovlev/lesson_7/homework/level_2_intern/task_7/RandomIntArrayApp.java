package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_2_intern.task_7;

class RandomIntArrayApp {

    public static void main(String[] args) {
        RandomIntArray randomIntArray = new RandomIntArray();

        int[] arrayNumbers = randomIntArray.randomArray(10);
        randomIntArray.printArray(arrayNumbers);
    }
}
