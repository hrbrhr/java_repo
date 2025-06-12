package org.javaguru.student_vitalii_lutsenko.lesson_6.classwork;

 class PrintNumbers {

     public static void main(String[] args) {
         int[] numbers = new int[10];

         numbers[3]= 999;
         numbers[6]= 666;
         numbers[9]=333;

         for (int i = 1; i < numbers.length; i++) {
             System.out.println(numbers[i]);
         }


         //for (int i = 0; i < 10; i++) { // Celie chisla + 1
            // System.out.println(i);
        // }

        // for (int i = 0; i <= 100; i++) { // Celie chisla + 1 vkluchaya 100
          //   System.out.println(i);
       //  }

       //  for (int i = 0; i < 10; i= i +2) { // Chetnie chisla cherez 2
         //    System.out.println(i);
      //   }




     }



     public void print () {

             int[] numbers = new int[10];

             for (int i = 1; i < numbers.length; i++) {
                 System.out.println(numbers[i]);
             }
             for (int i = 0; i < 10; i++) {
                 System.out.println(i);
             }


         }



}
