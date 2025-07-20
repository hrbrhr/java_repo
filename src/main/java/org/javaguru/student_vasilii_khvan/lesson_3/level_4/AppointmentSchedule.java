package org.javaguru.student_vasilii_khvan.lesson_3.level_4;

import java.time.LocalDate;

class AppointmentSchedule {

    private String name;
    private String specialty;
    private LocalDate date;
    private Appointment appointment1012;
    private Appointment appointment1416;

    AppointmentSchedule(String name, String specialty, LocalDate date, Appointment appointment1012,
                        Appointment appointment1416) {
        this.name = name;
        this.specialty = specialty;
        this.date = date;
        this.appointment1012 = appointment1012;
        this.appointment1416 = appointment1416;
    }

    String getName() {
        return name;
    }

    String getSpecialty() {
        return specialty;
    }

    LocalDate getDate() {
        return date;
    }

    Appointment getAppointment1012() {
        return appointment1012;
    }

    Appointment getAppointment1416() {
        return appointment1416;
    }
}
