package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_4_plus;

import java.time.LocalDate;

class DoctorTimetable {
    private String doctorName;
    private String doctorSpeciality;
    private LocalDate dateAppointment;

    private AppointmentBooking appointment_10_12;
    private AppointmentBooking appointment_14_16;

    DoctorTimetable(String doctorName,
                           String doctorSpeciality,
                           LocalDate dateAppointment,
                           AppointmentBooking appointment_10_12,
                           AppointmentBooking appointment_14_16) {
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.dateAppointment = dateAppointment;
        this.appointment_10_12 = appointment_10_12;
        this.appointment_14_16 = appointment_14_16;
    }

    String getDoctorName()                    {return doctorName;}
    String getDoctorSpeciality()              {return doctorSpeciality;}
    LocalDate getDateAppointment()            {return dateAppointment;}
    AppointmentBooking getAppointment_10_12() {return appointment_10_12;}
    AppointmentBooking getAppointment_14_16() {return appointment_14_16;}
}
