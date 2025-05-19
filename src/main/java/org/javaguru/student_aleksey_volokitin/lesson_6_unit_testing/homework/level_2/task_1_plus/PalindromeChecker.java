package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_2.task_1_plus;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();

        return text.equalsIgnoreCase(reversed);
    }

}
