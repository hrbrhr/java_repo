package org.javaguru.student_anastassija.lesson_5.level_1;

 class FizzBuzz {
     boolean Fizz (int number){return (number % 3) == 0;}
     boolean Buzz (int number){return (number % 5) == 0;}

     public String detect (int number){
         if (Fizz(number) && Buzz(number)){
             return "FizzBuzz";
         } else if (Buzz(number)) {
             return "Buzz";
         }else if (Fizz(number)){
             return "Fizz";
         }else {
             return "" + number + " not Fizz or Buzz";
         }
     }

}
