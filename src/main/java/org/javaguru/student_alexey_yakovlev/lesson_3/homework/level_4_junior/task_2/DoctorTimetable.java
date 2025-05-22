package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_2;


import java.util.Date;

class DoctorTimetable {

    private String doctorFirstname;
    private String doctorLastname;
    private String doctorSpeciality;
    private Date appointmentDate;
    private DoctorAppointment appointment1;
    private DoctorAppointment appointment2;

    public DoctorTimetable(String doctorFirstname,
                           String doctorLastname,
                           String doctorSpeciality,
                           Date appointmentDate,
                           DoctorAppointment appointment1,
                           DoctorAppointment appointment2) {
        this.doctorFirstname = doctorFirstname;
        this.doctorLastname = doctorLastname;
        this.doctorSpeciality = doctorSpeciality;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }
}
