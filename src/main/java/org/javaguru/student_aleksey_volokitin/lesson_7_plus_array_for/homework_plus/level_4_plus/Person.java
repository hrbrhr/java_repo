package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_4_plus;

class Person {
    private String lastName;
    private String firstName;
    private double salary;

    Person(String lastName, String firstName, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    String getLastName()  { return lastName; }
    String getFirstName() { return this.firstName; }
    double getSalary()    { return this.salary; }
}
