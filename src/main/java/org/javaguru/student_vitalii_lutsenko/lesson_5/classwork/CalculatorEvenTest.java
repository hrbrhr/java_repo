package org.javaguru.student_vitalii_lutsenko.lesson_5.classwork;

 class CalculatorEvenTest {

     public static void main(String[] args) {
         CalculatorEvenTest test = new CalculatorEvenTest ();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.testDouble();
         test.test5();
         test.test8();
         test.test9();
         test.test10();
         test.test11();
         test.test5_1();
         test.test5_2();
         test.test12();


     }
     public  void test1 () {
         int number = 2;

         CalculatorEven calculatorEven = new CalculatorEven();
         boolean realResult = calculatorEven.isEven(number);

         if (realResult == true){
             System.out.println("Test 1 = OK");
         } else {
             System.out.println("Test 1 = FAIL");

         }
     }

     public  void test2 () {
         int number = 3;

         CalculatorEven calculatorEven = new CalculatorEven();
         boolean realResult = calculatorEven.isEven(number);

         if (realResult == false){
             System.out.println("Test 2 = OK");
         } else {
             System.out.println("Test 2 = FAIL");

         }
     }

     public  void test3 () {
         int number = 3;

         CalculatorEven calculatorEven = new CalculatorEven();
         boolean realResult = calculatorEven.isOdd(number);

         if (realResult == true){
             System.out.println("Test 3 = OK");
         } else {
             System.out.println("Test 3 = FAIL");

         }
     }

     public void test4 () {
         int number = 2;

         CalculatorEven calculatorEven = new CalculatorEven();
         boolean realResult = calculatorEven.isOdd(number);

         if (realResult == false){
             System.out.println("Test 4 = OK");
         } else {
             System.out.println("Test 4 = FAIL");

         }
     }
     // find Average (num1,num2)



     // 1,1 -> 1.0

     public void testDouble(){
         double number1 = 5.5;
         double number2 = 5.500000000555;

         if (Math.abs(number1 - number2) < 0.00001) {
             System.out.println("Test double = OK");
         } else {
             System.out.println("Test double = FAIL");
         }


     }
     public void test5 (){
         int number1 = 1;
         int number2 = 1;

         CalculatorEven calculatorEven = new CalculatorEven();
         double realResult = calculatorEven.findAverage(number1, number2);

         if (Math.abs(realResult-1.0) < 0.00001) {
             System.out.println("Test 5 = OK");
         } else {
             System.out.println("Test 5 = FAIL");
         }

     }
     // dopisat' tri testa!6,7,

     public void test5_1 (){
         int number1 = 2;
         int number2 = 5;

         CalculatorEven calculatorEven = new CalculatorEven();
         double realResult = calculatorEven.findAverageV2(number1, number2);

         if (Math.abs(realResult-3.5) < 0.00001) {
             System.out.println("Test 5_1 = OK");
         } else {
             System.out.println("Test 5_1 = FAIL");
         }

     }
     public void test5_2 (){
         int number1 = 10;
         int number2 = 5;

         CalculatorEven calculatorEven = new CalculatorEven();
         double realResult = calculatorEven.findAverageV2(number1, number2);

         if (Math.abs(realResult-7.5) < 0.00001) {
             System.out.println("Test 5_2 = OK");
         } else {
             System.out.println("Test 5_2 = FAIL");
         }

     }



     // 1,2->2
     // 7,4 ->7
     // 3,3->3

     public  void test8 () {
         int number1 = 1;
         int number2 = 2;

         CalculatorEven calculatorEven = new CalculatorEven();
         int realResult = calculatorEven.max2Number(number1,number2);

         if (realResult == 2){
             System.out.println("Test 8 = OK");
         } else {
             System.out.println("Test 8 = FAIL");

         }
     }

     public  void test9 () {
         int number1 = 7;
         int number2 = 4;

         CalculatorEven calculatorEven = new CalculatorEven();
         int realResult = calculatorEven.max2Number(number1,number2);

         if (realResult == 7){
             System.out.println("Test 9 = OK");
         } else {
             System.out.println("Test 9 = FAIL");

         }
     }

     public  void test10 () {
         int number1 = 3;
         int number2 = 3;

         CalculatorEven calculatorEven = new CalculatorEven();
         int realResult = calculatorEven.max2Number(number1,number2);

         if (realResult == 3){
             System.out.println("Test 10 = OK");
         } else {
             System.out.println("Test 10 = FAIL");

         }
     }

     public  void test11 () {
         int number1 = 5;
         int number2 = 6;
         int number3 = 7;

         CalculatorEven calculatorEven = new CalculatorEven();
         int realResult = calculatorEven.findMax3(number1,number2,number3);

         if (realResult == 7){
             System.out.println("Test 11 = OK");
         } else {
             System.out.println("Test 11 = FAIL");

         }
     }
     public  void test12 () {
         int number1 = 15;
         int number2 = 6;
         int number3 = 7;

         CalculatorEven calculatorEven = new CalculatorEven();
         int realResult = calculatorEven.findMaxV2(number1,number2,number3);

         if (realResult == 15){
             System.out.println("Test 11 = OK");
         } else {
             System.out.println("Test 11 = FAIL");

         }
     }







}
