package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

class ArrayExample {
    public int[] createArray(int countOfElements) {
        return new int[countOfElements];
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array1 = arrayExample.createArray(10);
        int[] array2 = arrayExample.createArray(50);
        int[] array3 = arrayExample.createArray(100);

        arrayExample.printArray(array1);
    }
}
