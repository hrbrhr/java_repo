package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_4;

import java.time.LocalDate;

public class Appointment {
    private String doctorName;
    private String doctorSurname;
    private String specialty;
    private LocalDate date;
    private final Record firstRecord;
    private final Record secondRecord;

    public Appointment(Record firstRecord, Record secondRecord, LocalDate date, String specialty, String doctorSurname, String doctorName) {
        this.firstRecord = firstRecord;
        this.secondRecord = secondRecord;
        this.date = date;
        this.specialty = specialty;
        this.doctorSurname = doctorSurname;
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Record getFirstRecord() {
        return firstRecord;
    }

    public Record getSecondRecord() {
        return secondRecord;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctorName='" + doctorName + '\'' +
                ", doctorSurname='" + doctorSurname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", date=" + date +
                ", firstRecord=" + firstRecord +
                ", secondRecord=" + secondRecord +
                '}';
    }



}
