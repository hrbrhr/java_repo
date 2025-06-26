package org.javaguru.student_vitalii_lutsenko.lesson_6.homework.task_1;

 class TriangleSquareTest {

     public static void main(String[] args) {

         TriangleSquareTest test = new TriangleSquareTest ();

         test.test1();
         test.test2();
         test.test3();




     }

     // Test case 1 : a = 2, b = 3, c = 5;
     public void test1 () {

         int a = 2;
         int b = 3;
         int c = 5;

         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSemiPerimeter(a,b,c);

         if (Math.abs(realResult - 5) < 0.00001) {
             System.out.println("Test case 1 = OK");
         } else {
             System.out.println("Test case 1 = FAIL");
         }

     }

     // Test case 2 : a = 3, b = 4, c = 5;
     public void test2 () {

         int a = 3;
         int b = 4;
         int c = 5;

         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSquare(a,b,c);

         if (Math.abs(realResult - 6) < 0.00001) {
             System.out.println("Test case 2 = OK");
         } else {
             System.out.println("Test case 2 = FAIL");
         }

     }

     public void test3 () {

         int a = 2;
         int b = 3;
         int c = 5;

         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSquare(a,b,c);

         if (Math.abs(realResult - 5) < 0.00001) {
             System.out.println("Test case 3 = OK");
         } else {
             System.out.println("Test case 3 = FAIL");
         }

     }





}
