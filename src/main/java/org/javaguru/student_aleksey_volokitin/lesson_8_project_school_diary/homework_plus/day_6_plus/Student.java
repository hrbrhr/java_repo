package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_6_plus;

class Student {
    String firstName;
    String lastName;
    String classOfStudent;

    public Student(String firstName, String lastName, String classOfStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classOfStudent = classOfStudent;
    }

    public String getFirstName()      { return firstName; }
    public String getLastName()       { return lastName; }
    public String getClassOfStudent() { return classOfStudent; }

    public void setFirstName(String newFirstName)           { this.firstName = newFirstName; }
    public void setLastName(String newLastName)             { this.lastName = newLastName; }
    public void setClassOfStudent(String newClassOfStudent) { this.classOfStudent = newClassOfStudent; }
}
