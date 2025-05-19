package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_2_plus.task_1_plus;

class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
        palindromeCheckerTest.test1();
        palindromeCheckerTest.test2();
    }
    // Лёша на полке клопа нашёл
    void test1() {
        String text = "Лёшанаполкеклопанашёл";
        boolean expectedResult = true;

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);

        if (result == expectedResult) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }

    void test2() {
        String text = "Нешанаполкеклопанашёл";
        boolean expectedResult = false;

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);

        if (result == expectedResult) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }
}
