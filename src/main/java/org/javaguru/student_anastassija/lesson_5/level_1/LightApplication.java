package org.javaguru.student_anastassija.lesson_5.level_1;

public class LightApplication {

    public static void main(String[] args) {

        Light light = new Light();

        System.out.println("Wavelength 256 = " + light.detect(256));
        System.out.println("Wavelength 381 = " + light.detect(381));
        System.out.println("Wavelength 652 = " + light.detect(652));
        System.out.println("Wavelength 530 = " + light.detect(530));
        System.out.println("Wavelength 249 = " + light.detect(249));
        System.out.println("Wavelength 420 = " + light.detect(420));

    }
}
