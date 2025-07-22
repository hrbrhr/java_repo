package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.lessoncode;

public class Country {

    private String name;
    private String code;
    private double population; // in millions

    public Country(String name, String code, double population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPopulation() {
        return population;
    }
}
