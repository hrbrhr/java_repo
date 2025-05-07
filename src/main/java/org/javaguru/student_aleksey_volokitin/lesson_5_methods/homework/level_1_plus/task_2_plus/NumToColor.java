package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework.level_1_plus.task_2_plus;

class NumToColor {
    String convert (int number){

        if ((number >=380) && (number < 450)) {
            return "Violet";
        }
        else if ((number >=450) && (number < 495)) {
            return "Blue";
        }
        else if ((number >=495) && (number < 570)) {
            return "Green";
        }
        else if ((number >=570) && (number < 590)) {
            return "Yellow";
        }
        else if ((number >=590) && (number < 620)) {
            return "Orange";
        }
        else if ((number >=620) && (number <= 750)) {
            return "Red";
        }
        else {
            return "Invisible Light";
        }
    }
}
