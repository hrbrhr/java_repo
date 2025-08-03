package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

class EnumPractice {

    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        if (today == Day.FRIDAY) {
            System.out.println("Ура, пятница!");
        }
    }

}
