package org.javaguru.student_vitalii_lutsenko.lesson_6.homework.task_2;

 class AverageFinderTest {

     public static void main(String[] args) {

         AverageFinderTest test = new AverageFinderTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();

     }

     // test case 1: num1 = 0, num2 = 2 ; result = 1;
     public void test1() {
         int num1 = 0;
         int num2 = 2;
         AverageFinder averageFinder = new AverageFinder();
         int realResult = averageFinder.findAverage(num1, num2);

         if (Math.abs(realResult - 1) < 0.00001) {
             System.out.println("Test case 1 = OK");
         } else {
             System.out.println("Test case 1 = FAIL");
         }
     }

     // test case 2: num1 = 6, num2 = 7 ; result = 6,5;
     public void test2() {
         int num1 = 6;
         int num2 = 7;
         AverageFinder averageFinder = new AverageFinder();
         int realResult = averageFinder.findAverage(num1, num2);

         if (Math.abs(realResult - 6) < 0.00001) {
             System.out.println("Test case 2 = OK");
         } else {
             System.out.println("Test case 2 = FAIL");
         }
     }

     // test case 3: num1 = 20, num2 = 4 ; result = 12;
     public void test3() {
         int num1 = 20;
         int num2 = 4;
         AverageFinder averageFinder = new AverageFinder();
         int realResult = averageFinder.findAverage(num1, num2);

         if (Math.abs(realResult - 12) < 0.00001) {
             System.out.println("Test case 3 = OK");
         } else {
             System.out.println("Test case 3 = FAIL");
         }
     }

     // test case 4: num1 = -5, num2 = 10 ; result = 7.5;
     public void test4() {
         int num1 = -5;
         int num2 = 10;
         AverageFinder averageFinder = new AverageFinder();
         int realResult = averageFinder.findAverage(num1, num2);

         if (Math.abs(realResult - 2) < 0.00001) {
             System.out.println("Test case 4 = OK");
         } else {
             System.out.println("Test case 4 = FAIL");
         }
     }

     // test case 5: num1 = 0, num2 = 0 ; result = 0;
     public void test5() {
         int num1 = 0;
         int num2 = 0;
         AverageFinder averageFinder = new AverageFinder();
         int realResult = averageFinder.findAverage(num1, num2);

         if (Math.abs(realResult - 0) < 0.00001) {
             System.out.println("Test case 5 = OK");
         } else {
             System.out.println("Test case 5 = FAIL");
         }
     }





 }
