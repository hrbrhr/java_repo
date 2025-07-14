package org.javaguru.student_evgeniy_shendelev.lesson_5.level_1.task_2;

class ColorDetector {
    String detect(Integer a) {
        return switch (a) {
            case Integer i when (a >= 380 && a < 450) -> "Violet";
            case Integer i when (a >= 450 && a < 495) -> "Blue";
            case Integer i when (a >= 495 && a < 570) -> "Green";
            case Integer i when (a >= 570 && a < 590) -> "Yellow";
            case Integer i when (a >= 590 && a < 620) -> "Orange";
            case Integer i when (a >= 620 && a < 751) -> "Red";
            default -> "Invisible Light";
        };
    }

}
