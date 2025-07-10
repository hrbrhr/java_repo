package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_3.task_4;

abstract class Salary {

    private String name;
    private String surname;
    int salaryAmount;

    public Salary(String name, String surname, int salaryAmount) {
        this.name = name;
        this.surname = surname;
        this.salaryAmount = salaryAmount;
    }

}
