package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_1_plus.task_2_plus;

import java.util.Scanner;

class NumToColorApp {
    public static void main(String[] args) {
        NumToColor numToColor = new NumToColor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a wavelength of light: ");
        int numColor = scanner.nextInt();

        System.out.println("Wavelength of light " + numColor +
                           " is a " + numToColor.convert(numColor) +
                           " color");
        scanner.close();
    }
}
