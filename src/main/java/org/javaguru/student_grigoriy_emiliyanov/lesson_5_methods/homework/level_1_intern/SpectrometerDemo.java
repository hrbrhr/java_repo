package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_1_intern;

//Программа должна определять цвет в зависимости
//от длины волны в соответствии со следующими правилами:
//
//        380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")

import java.util.Scanner;

public class SpectrometerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            System.out.println("Try " + i + " of " + 8);
            System.out.println("Input your wavelength:");
            int wavelength = scanner.nextInt();
            System.out.println("Color is: " + determineColor(wavelength));
        }
        System.out.println("Bye-bye!");
    }

    static String determineColor(int wavelength) {
        if (withinClosedInterval(wavelength, 380, 449)) return "Violet";
        if (withinClosedInterval(wavelength, 450, 494)) return "Blue";
        if (withinClosedInterval(wavelength, 495, 569)) return "Green";
        if (withinClosedInterval(wavelength, 570, 589)) return "Yellow";
        if (withinClosedInterval(wavelength, 590, 619)) return "Orange";
        if (withinClosedInterval(wavelength, 620, 750)) return "Red";
        return "Invisible light";
    }

    static boolean withinClosedInterval(int n, int lowerLimit, int upperLimit) {
        return n >= lowerLimit && n <= upperLimit;
    }
}
