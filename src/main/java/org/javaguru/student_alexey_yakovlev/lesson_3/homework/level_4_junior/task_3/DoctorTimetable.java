package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_3;

import java.util.Date;

class DoctorTimetable {

    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpecialty;
    private Date appointmentDate;
    private DoctorAppointment appointment1;
    private DoctorAppointment appointment2;

    public DoctorTimetable(String doctorFirstName, String doctorLastName, String doctorSpecialty, Date appointmentDate,
                           DoctorAppointment appointment1, DoctorAppointment appointment2) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.doctorSpecialty = doctorSpecialty;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public DoctorAppointment getAppointment1() {
        return appointment1;
    }

    public DoctorAppointment getAppointment2() {
        return appointment2;
    }
}
