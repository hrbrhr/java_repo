package org.javaguru.student_evgeniy_shendelev.lesson_5.level_1.task_2;

class ColorDetectorDemo {
    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();
        for (int i = 360; i < 780; i += 10) {
            System.out.println(i + ": " + colorDetector.detect(i));
    }
}
}
