package org.javaguru.student_anastassija.lesson_12.lessoncode;

import java.lang.Exception;

class ArrayExceptionAPP {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[3];

        ArrayException arrayException =
                new ArrayException(
                        3,
                        3,
                         "Array index out of bounds"
        );

        throw arrayException;//kidaet iskljuciteljnuju situaciju

        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);

    }

}
