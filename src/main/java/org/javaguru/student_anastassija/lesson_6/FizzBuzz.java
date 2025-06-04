package org.javaguru.student_anastassija.lesson_6;

 class FizzBuzz {

     public String detect (int number){
         if (number == 0) return "0";
         if (fizz(number) && buzz(number)){
             return "FizzBuzz";
         } else if (buzz(number)) {
             return "Buzz";
         }else if (fizz(number)){
             return "Fizz";
         }else {
             return "" + number;
         }
     }

     boolean fizz (int number){return (number % 3) == 0;}
     boolean buzz (int number){return (number % 5) == 0;}



}
