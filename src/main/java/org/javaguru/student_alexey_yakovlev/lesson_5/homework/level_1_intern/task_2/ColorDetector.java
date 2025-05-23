package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_1_intern.task_2;

class ColorDetector {

    String findColor(int wavelength) {
        if (isViolet(wavelength)) {
            return "Violet";
        }
        if (isBlue(wavelength)) {
            return "Blue";
        }
        if (isGreen(wavelength)) {
            return "Green";
        }
        if (isYellow(wavelength)) {
            return "Yellow";
        }
        if (isOrange(wavelength)) {
            return "Orange";
        }
        if (isRed(wavelength)) {
            return "Red";
        }
        return "Invisible Light";
    }

    private boolean isViolet(int wavelength) {
        return wavelength >= 380 && wavelength < 450;
    }

    private boolean isBlue(int wavelength) {
        return wavelength >= 450 && wavelength < 495;
    }

    private boolean isGreen(int wavelength) {
        return wavelength >= 495 && wavelength < 570;
    }

    private boolean isYellow(int wavelength) {
        return wavelength >= 570 && wavelength < 590;
    }

    private boolean isOrange(int wavelength) {
        return wavelength >= 590 && wavelength < 620;
    }

    private boolean isRed(int wavelength) {
        return wavelength >= 620 && wavelength < 750;
    }
}
