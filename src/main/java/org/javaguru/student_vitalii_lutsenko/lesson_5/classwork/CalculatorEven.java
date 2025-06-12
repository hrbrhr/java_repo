package org.javaguru.student_vitalii_lutsenko.lesson_5.classwork;

class CalculatorEven {

     boolean isEven(int number){ //return ((number % 2 ) ==  0);
         if ((number % 2) == 0) {
             return true;
         } else {
             return false;
         }
     }
    boolean isOdd(int number){ //return ((number % 2 ) != 1);
        if ((number % 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    int findAverage(int number1,int number2){
         return (number1 +number2)/2;
         // vozvrashaet logniy rezultat iz za togo chto 2 ne double

    }

    double findAverageV2(int number1,int number2){
        return (number1 +number2)/(double)2;
    }

    int max2Number(int number1,int number2){
         return ((number1 > number2) ? number1 : number2);
    }

    int findMax3(int number1, int number2, int number3){
       int max2 = max2Number(number1, number2);
       return max2Number(max2, number3);
    }

    int findMaxV2 (int number1,int number2, int number3){
         int max = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
         return max;
    }
}
