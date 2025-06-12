package org.javaguru.student_anastassija.lesson_7;

class ArrayApp {
    public static void main(String[] args) {
        ArrayEx arrayEx = new ArrayEx();

        //int[] numbers1 = arrayEx.createArray(6);
        int[] numbers2 = arrayEx.createArray(4);
        int[] numbers3 = arrayEx.createArray(7);

        //arrayEx.printArray(numbers1);
        arrayEx.printArray(numbers2);
        arrayEx.printArray(numbers3);


        int[] numbers1 = arrayEx.createArray(5);//sozdajot massiv dlinoi 5
        arrayEx.printArray(numbers1);//pechataet massiv na ekran
        arrayEx.fillArrayWithRandomNumbers(numbers1);//prisvaivaet random.znacenija, t.e zapolnjaet massiv
        arrayEx.printArray(numbers1);//pechataet random massiv na ekran uzhe zapolnennyj


    }
}
