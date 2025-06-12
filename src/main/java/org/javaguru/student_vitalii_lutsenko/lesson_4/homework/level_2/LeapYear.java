package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_2;

public class LeapYear {

     public boolean isLeapYear(int number) {
        return (number % 4 == 0 && number % 100 != 0) || (number % 400 == 0);
     }

}
