package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_1_intern.task_2;

class ColorDetectorApp {

    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();

        int wavelength1 = 380;
        int wavelength2 = 450;
        int wavelength3 = 500;
        int wavelength4 = 580;
        int wavelength5 = 600;
        int wavelength6 = 700;
        int wavelength7 = 1000;

        System.out.println(colorDetector.findColor(wavelength1));
        System.out.println(colorDetector.findColor(wavelength2));
        System.out.println(colorDetector.findColor(wavelength3));
        System.out.println(colorDetector.findColor(wavelength4));
        System.out.println(colorDetector.findColor(wavelength5));
        System.out.println(colorDetector.findColor(wavelength6));
        System.out.println(colorDetector.findColor(wavelength7));
    }
}
