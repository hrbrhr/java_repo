package org.javaguru.mentor.lesson_12_exceptions.lessoncode;

class ArrayExceptionApp {

    public static void main(String[] args) throws Exception {

        int[] arr = new int[3];

        ArrayException arrayException =
                new ArrayException(
                        3,
                        3,
                        "Array index out of bounds"
                );
        throw arrayException;

/*


        System.out.println(arr[3]);

        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);
*/

    }

}
