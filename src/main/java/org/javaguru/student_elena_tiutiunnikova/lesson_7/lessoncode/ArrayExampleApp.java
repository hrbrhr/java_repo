package org.javaguru.student_elena_tiutiunnikova.lesson_7.lessoncode;

class ArrayExampleApp {
    public static void main(String[] args) {

        ArrayExample arrayExample = new ArrayExample();

        int[] number2 = arrayExample.createArray(40);
        int[] number3 = arrayExample.createArray(20);

        arrayExample.printArray(number2);
        arrayExample.printArray(number3);

        int[] number1 = arrayExample.createArray(5);
        arrayExample.printArray(number1);
        arrayExample.randomArray(number1);
        arrayExample.printArray(number1);

    }
}