package org.javaguru.student_vitalii_lutsenko.lesson_5.classwork;

class CalculatorEven {

     boolean isEven(int number){


         if ((number % 2) == 0) {
             return true;
         } else {
             return false;
         }

         //return ((number % 2 ) ==  0);
     }


    boolean isOdd(int number){

        if ((number % 2) == 0) {
            return false;
        } else {
            return true;
        }

        //return ((number % 2 ) ==  0);

    }

    int findAverage(int number1,int number2){
         return (number1 +number2)/2;

    }

    double findAverageV2(int number1,int number2){
        return (number1 +number2)/(double)2;

    }

    int maxNumber(int number1,int number2){

         return (number1 > number2) ? number1 : number2;
    }

    int findMax3(int number1, int number2, int number3){

       int max = maxNumber(number1, number2);
       return maxNumber(max, number3);

    }

    int findMaxV2 (int number1,int number2, int number3){
         int max = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
         return max;
    }






}
