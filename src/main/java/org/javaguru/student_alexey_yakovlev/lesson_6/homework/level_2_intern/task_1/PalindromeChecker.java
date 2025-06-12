package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_2_intern.task_1;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
