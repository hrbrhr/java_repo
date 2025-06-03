package org.javaguru.student_anastassija.lesson_6.homework.level_2;

class PalindromeChecker1 {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
