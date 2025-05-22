package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_10_plus;

class FindFactorialApp {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 5;
        int result = factorial.calculateFactorial(number);
        int resultFactorial = factorial.calculateFactorialWithRecursion(number);
        System.out.println(result);
        System.out.println(resultFactorial);
    }
}
