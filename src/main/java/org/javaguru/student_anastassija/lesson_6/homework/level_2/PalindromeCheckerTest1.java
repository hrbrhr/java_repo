package org.javaguru.student_anastassija.lesson_6.homework.level_2;

public class PalindromeCheckerTest1 {

    public static void main(String[] args) {
        PalindromeCheckerTest1 test = new PalindromeCheckerTest1();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }
// Radar -> true
    public void test1() {

    PalindromeChecker1 palindromeChecker1 = new PalindromeChecker1();
    boolean realResult = palindromeChecker1.isPalindrome("radar");

    if (realResult == true){
        System.out.println("TEST 1 = OK");
    } else {
        System.out.println("TEST 1 = FALSE");
    }
    }
// Noon -> true
    public void test2() {

    PalindromeChecker1 palindromeChecker1 = new PalindromeChecker1();
    boolean realResult = palindromeChecker1.isPalindrome("Noon");

        if (realResult == true){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }
    // No, be happy! -> false
public void test3() {

    PalindromeChecker1 palindromeChecker1 = new PalindromeChecker1();
    boolean realResult = palindromeChecker1.isPalindrome("No, be happy!");

    if (realResult == false){
        System.out.println("TEST 3 = OK");
    } else {
        System.out.println("TEST 3 = FALSE");
    }
}
// Roof -> false
public void test4() {

    PalindromeChecker1 palindromeChecker1 = new PalindromeChecker1();
    boolean realResult = palindromeChecker1.isPalindrome("Roof");

    if (realResult == false){
        System.out.println("TEST 4 = OK");
    } else {
        System.out.println("TEST 4 = FALSE");
    }
}

// Never odd or even -> true ??
}