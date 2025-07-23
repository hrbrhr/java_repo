package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_2_intern;

class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest suite = new PalindromeCheckerTest();
        suite.test1();
        suite.test2();
        suite.test3();
    }

    private void test1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean actualResult = palindromeChecker.isPalindrome("madam");
        boolean expectedResult = true;
        checkExpect(expectedResult, actualResult, "Should detect palindrome lower case");
    }

    private void test2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean actualResult = palindromeChecker.isPalindrome("madaam");
        boolean expectedResult = false;
        checkExpect(expectedResult, actualResult, "Should detect non palindrome lower case");
    }

    private void test3() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean actualResult = palindromeChecker.isPalindrome("Madam");
        boolean expectedResult = true;
        checkExpect(expectedResult, actualResult, "Should detect palindrome upper case");
    }

    private void checkExpect(boolean expected, boolean real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
