package org.javaguru.student_aleksey_volokitin.lesson_2_variables_and_datatypes.homework_plus.level_2_plus;

import java.util.Scanner;

class PrintingName {
    public static void main(String[] args) {
        System.out.print("Input a name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
