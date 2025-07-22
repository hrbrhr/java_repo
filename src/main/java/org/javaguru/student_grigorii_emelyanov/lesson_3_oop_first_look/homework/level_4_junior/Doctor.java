package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_4_junior;

public class Doctor {
    private String firstName;
    private String lastName;
    private String speciality;

    private Visit amVisit = null;
    private Visit pmVisit = null;

    public Doctor(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public void setAmVisit(Visit amVisit) {
        this.amVisit = amVisit;
    }

    public void setPmVisit(Visit pmVisit) {
        this.pmVisit = pmVisit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Visit getAmVisit() {
        return amVisit;
    }

    public Visit getPmVisit() {
        return pmVisit;
    }
}
