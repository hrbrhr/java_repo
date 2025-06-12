package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

class Teacher {
    private String firstName;
    private String lastName;
    private String qualification;

    public Teacher(String firstName, String lastName, String qualification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
    }

    public String getFirstName()      { return firstName; }
    public String getLastName()       { return lastName; }
    public String getQualification() { return qualification; }

    public void setFirstName(String newFirstName)           { this.firstName = newFirstName; }
    public void setLastName(String newLastName)             { this.lastName = newLastName; }
    public void setQualification(String newQualification) { this.qualification = newQualification; }
}
