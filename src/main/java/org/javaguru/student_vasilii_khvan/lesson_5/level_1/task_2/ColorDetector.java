package org.javaguru.student_vasilii_khvan.lesson_5.level_1.task_2;

class ColorDetector {

    String detect(int wave) {
        if ((wave >= 380) && (wave < 450)) {
            return "Violet";
        } else if ((wave >= 450) && (wave < 495)) {
            return "Blue";
        } else if ((wave >= 495) && (wave < 570)) {
            return "Green";
        } else if ((wave >= 570) && (wave < 590)) {
            return "Yellow";
        } else if ((wave >= 590) && (wave < 620)) {
            return "Orange";
        } else if ((wave >= 620) && (wave < 750)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}