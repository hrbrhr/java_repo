package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_3.task_4;

class Director extends Salary {

    private int monthBonus;

    public Director(String name, String surname, int salaryAmount, int monthBonus) {
        super(name, surname, salaryAmount);
        this.monthBonus = monthBonus;
    }
}
