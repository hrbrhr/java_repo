package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_1_plus;

class Person {
    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    String getFirstName() { return firstName; }
    String getLastName()  { return lastName; }
    int getAge()          { return age; }

    void setFirstName(String newFirstName) { this.firstName = newFirstName; }
    void setLastName(String newLastName)   { this.lastName = newLastName; }
    void setAge(int newAge)                { this.age = age; }
}
