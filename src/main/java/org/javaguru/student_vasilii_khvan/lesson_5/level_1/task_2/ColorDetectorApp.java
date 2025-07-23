package org.javaguru.student_vasilii_khvan.lesson_5.level_1.task_2;

class ColorDetectorApp {

    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();
        System.out.println(colorDetector.detect(301));
        System.out.println(colorDetector.detect(391));
        System.out.println(colorDetector.detect(462));
        System.out.println(colorDetector.detect(505));
        System.out.println(colorDetector.detect(579));
        System.out.println(colorDetector.detect(593));
        System.out.println(colorDetector.detect(633));
    }
}
