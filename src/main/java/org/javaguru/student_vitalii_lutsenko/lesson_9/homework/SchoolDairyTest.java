package org.javaguru.student_vitalii_lutsenko.lesson_9.homework;

class SchoolDairyTest {


     public static void main(String[] args) {

         SchoolDairyTest test = new SchoolDairyTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();
         test.test6();
         test.test7();
         test.test8();
         test.test9();
         test.test10();

     }

     //test case 1 : {subject = "Math" , mark = 5} , "Math" = 5

     public void test1() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 5);
         int result = dairy.findMaxMark("Math");
         if (result ==5) {
             System.out.println("Test 1 =  OK ");
         } else {
             System.out.println("Test 1 = FAILED ");
         }
     }

     //test case 2 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 4}, "Math" = 5

     public void test2() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 5);
         dairy.addMark("Math", 4);
         int result = dairy.findMaxMark("Math");
         if (result ==5) {
             System.out.println("Test 2 =  OK ");
         } else {
             System.out.println("Test 2 = FAILED ");
         }
     }

     //test case 3 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 5}, "Math" = 5

     public void test3() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 5);
         dairy.addMark("Math", 5);
         int result = dairy.findMaxMark("Math");
         if (result ==5) {
             System.out.println("Test 3 =  OK ");
         } else {
             System.out.println("Test 3 = FAILED ");
         }
     }

     //test case 4 : {} , "Math" = 0

     public void test4() {

         SchoolDairy dairy = new SchoolDairy();
         int result = dairy.findMaxMark("Math");
         if (result ==0) {
             System.out.println("Test 4 =  OK ");
         } else {
             System.out.println("Test 4 = FAILED ");
         }
     }

     //test case 5 : {subject = "Math" , mark = 5} , {subject = "Eng", mark = 10}, "Math" = 5

     public void test5() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 5);
         dairy.addMark("Eng", 10);
         int result = dairy.findMaxMark("Math");
         if (result ==5) {
             System.out.println("Test 5 =  OK ");
         } else {
             System.out.println("Test 5 = FAILED ");
         }
     }
     //test case 6 : {subject = "Math" , mark = 3} , "Math" = 3
     public void test6() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 3);
         int result = dairy.findMinMark("Math");
         if (result ==3) {
             System.out.println("Test 6 =  OK ");
         } else {
             System.out.println("Test 6 = FAILED ");
         }
     }
     //test case 7 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 10}, "Math" = 5

     public void test7() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 5);
         dairy.addMark("Math", 10);
         int result = dairy.findMinMark("Math");
         if (result ==5) {
             System.out.println("Test 7 =  OK ");
         } else {
             System.out.println("Test 7 = FAILED ");
         }
     }
     //test case 3 : {subject = "Math" , mark = 8} , {subject = "Math", mark = 3}, "Math" = 3

     public void test8() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Math", 8);
         dairy.addMark("Math", 3);
         int result = dairy.findMinMark("Math");
         if (result ==3) {
             System.out.println("Test 8 =  OK ");
         } else {
             System.out.println("Test 8 = FAILED ");
         }
     }
     //test case 9 : {} , "Math" = 0

     public void test9() {

         SchoolDairy dairy = new SchoolDairy();
         int result = dairy.findMinMark("Math");
         if (result ==0) {
             System.out.println("Test 9 =  OK ");
         } else {
             System.out.println("Test 9 = FAILED "+ result);
         }
     }
     //test case 10 : {subject = "Eng" , mark = 7} , {subject = "Math", mark = 10}, "Math" = 10

     public void test10() {

         SchoolDairy dairy = new SchoolDairy();
         dairy.addMark("Eng", 7);
         dairy.addMark("Math", 10);
         int result = dairy.findMinMark("Math");
         if (result ==10) {
             System.out.println("Test 10 =  OK ");
         } else {
             System.out.println("Test 10 = FAILED ");
         }
     }









}
