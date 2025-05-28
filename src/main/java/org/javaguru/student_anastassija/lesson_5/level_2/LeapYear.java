package org.javaguru.student_anastassija.lesson_5.level_2;

class LeapYear {

    boolean LeapYear(int year){return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));}

    public String detect (int year){
        if (LeapYear(year)){
            return "Year " + year + " is leap";
        }else {
            return "Guys, " + year + " is not a leap year!" ;
        }
    }


}
