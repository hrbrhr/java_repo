package org.javaguru.student_vasilii_khvan.lesson_3.level_4;

import java.time.LocalDate;

public class DoctorTimetableApp {

    public static void main(String[] args) {
        Appointment appointment1012 = new Appointment("Khvan Vasilii", "bronchitis", 6000);
        Appointment appointment1416 = new Appointment("Dmitry Popov", "cold", 4000);

        AppointmentSchedule appointmentSchedule = new AppointmentSchedule("Alex Mitchel", "therapist",
                LocalDate.of(2025, 7, 21), appointment1012, null);
        AppointmentSchedule appointmentSchedule2 = new AppointmentSchedule("Doctor Aibolit", "therapist",
                LocalDate.of(2025, 7, 21), null, appointment1416);
    }
}
