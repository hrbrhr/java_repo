package org.javaguru.student_aleksey_volokitin.lesson_12_exceptions.lessoncode;

class ArrayApp {
    public static void main(String[] args) throws Exception{
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[2]);

        ArrayException arrayException1 =
                new ArrayException(3,
                        3,
                        "Array index out of bound");
        throw arrayException1;
    }
}
