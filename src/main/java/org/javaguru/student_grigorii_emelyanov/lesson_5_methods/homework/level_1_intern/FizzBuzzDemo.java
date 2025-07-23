package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_1_intern;

import java.util.Scanner;

class FizzBuzzDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Try " + i + " of " + 5);
            System.out.println("Input your integer:");
            int n = scanner.nextInt();
            System.out.println(fizzBuzz(n));
        }
        System.out.println("Bye-bye!");
    }

    static String fizzBuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return "" + n;
    }
}
