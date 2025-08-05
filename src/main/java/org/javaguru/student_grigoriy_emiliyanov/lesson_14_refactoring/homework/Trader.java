package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
