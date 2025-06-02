package org.javaguru.student_pavel_gorev.lesson_3.level_4.task3;

class DoctorTimetable {
    private String doctorFirstName;
    private String doctorLastName;
    private String specialty;
    private String appointmentDate;
    private Appointment morningAppointment;
    private Appointment afternoonAppointment;

    public DoctorTimetable(String doctorFirstName,
                           String doctorLastName, String specialty, String appointmentDate,
                           Appointment morningAppointment, Appointment afternoonAppointment) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.specialty = specialty;
        this.appointmentDate = appointmentDate;
        this.morningAppointment = morningAppointment;
        this.afternoonAppointment = afternoonAppointment;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public Appointment getMorningAppointment() {
        return morningAppointment;
    }

    public Appointment getAfternoonAppointment() {
        return afternoonAppointment;
    }
}
