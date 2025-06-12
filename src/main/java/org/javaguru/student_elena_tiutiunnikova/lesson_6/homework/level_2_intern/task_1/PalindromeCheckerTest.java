package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_2_intern.task_1;

class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    // Дед -> ok
    public void test1 () {
        String text = "Дед";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome(text);

        if (realResult == true) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // дедушка -> fail
    public void test2 () {
        String text = "дедушка";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome(text);

        if (realResult == true) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    // Аргентина манит негра -> ok
    public void test3 () {
        String text = "Аргентина манит негра";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome(text);

        if (realResult == true) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    // 121 -> ok
    public void test4 () {
        String text = "121";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome(text);

        if (realResult == true) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }
}
