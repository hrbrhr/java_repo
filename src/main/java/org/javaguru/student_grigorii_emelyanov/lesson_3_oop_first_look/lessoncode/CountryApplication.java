package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.lessoncode;

public class CountryApplication {
    public static void main(String[] args) {
        Country russia = new Country("Russia", "ru", 141.2);

        System.out.println("Country name: " + russia.getName());
        System.out.println("Country code: " + russia.getCode());
        System.out.println("Country population: " + russia.getPopulation());
    }
}
