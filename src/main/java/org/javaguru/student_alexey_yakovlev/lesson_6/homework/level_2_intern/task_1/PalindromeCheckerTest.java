package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_2_intern.task_1;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
        palindromeCheckerTest.test1();
        palindromeCheckerTest.test2();
    }

    public void test1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("level");

        if (realResult == true) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("leved");

        if (realResult == false) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }
}
