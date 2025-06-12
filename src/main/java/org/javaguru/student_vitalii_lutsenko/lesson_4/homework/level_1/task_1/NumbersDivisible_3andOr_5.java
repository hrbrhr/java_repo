package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_1.task_1;

 class NumbersDivisible_3andOr_5 {

     private static boolean isDivisibleBy3(int number) {
         return (number % 3 == 0);
     }

     private static boolean isDivisibleBy5(int number) {
         return (number % 5 == 0);
     }

     public static String sorter (int number) {
         if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
             return "FizzBuzz";
         } else if (isDivisibleBy3(number)) {
             return "Fizz";
         } else if (isDivisibleBy5(number)) {
             return "Buzz";
         } else {
             return  "" + number;
         }
     }


}
