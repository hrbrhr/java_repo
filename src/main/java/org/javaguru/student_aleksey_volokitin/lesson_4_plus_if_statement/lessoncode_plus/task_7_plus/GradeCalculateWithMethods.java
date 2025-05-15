package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_7_plus;

import java.util.Scanner;

class GradeCalculateWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 0 to 100: ");
        int number = scanner.nextInt();

        if (isRangeAFrom90To100(number)) {
            System.out.println("A");
        }
        else if (isRangeBFrom80To89(number)) {
            System.out.println("B");
        }
        else if (isRangeCFrom70To79(number)) {
            System.out.println("C");
        }
        else if (isRangeDFrom60To69(number)) {
            System.out.println("D");
        }
        else if (isRangeFFrom0To59(number)) {
            System.out.println("F");
        }
    }
    private static boolean isRangeAFrom90To100(int number) {
        return (number >= 90) && (number <= 100);
    }
    private static boolean isRangeBFrom80To89(int number) {
        return (number >= 80) && (number <= 89);
    }
    private static boolean isRangeCFrom70To79(int number) {
        return (number >= 70) && (number <= 79);
    }
    private static boolean isRangeDFrom60To69(int number) {
        return (number >= 60) && (number <= 69);
    }
    private static boolean isRangeFFrom0To59(int number) {
        return (number >= 0) && (number <= 59);
    }
}
