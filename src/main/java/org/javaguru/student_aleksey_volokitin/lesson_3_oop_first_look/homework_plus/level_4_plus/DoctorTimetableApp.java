package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_4_plus;

import java.time.LocalDate;

class DoctorTimetableApp {
    public static void main(String[] args) {
        AppointmentBooking doctor1Time_10_12 = new AppointmentBooking("Patient 1 Ivanova I.I.",
                                                                    "Diagnose patient 1 Ivanova I.I",
                                                                            1000);
        AppointmentBooking doctor1Time_14_16 = new AppointmentBooking("Patient 2 Ivanova I.I.",
                                                                    "Diagnose patient 2 Ivanova I.I.",
                                                                            1100);
        LocalDate doctor1Date = LocalDate.of(2025, 5, 1);
        DoctorTimetable doctor1Timetable = new DoctorTimetable("Ivanov I.I.",
                                                            "Therapist",
                                                                          doctor1Date,
                                                                          doctor1Time_10_12,
                                                                          doctor1Time_14_16);

        AppointmentBooking doctor2Time_10_12 = new AppointmentBooking("Patient 1 Petrova P.P.",
                                                                    "Diagnose patient 1 Petrova P.P.",
                                                                            2000);
        AppointmentBooking doctor2Time_14_16 = new AppointmentBooking("Patient 2 Petrova P.P.",
                                                                    "Diagnose patient 2 Petrova P.P.",
                                                                            2100);
        LocalDate doctor2Date = LocalDate.of(2025, 5, 5);
        DoctorTimetable doctor2Timetable = new DoctorTimetable("Petrov P.P.",
                                                            "Surgeon",
                                                                          doctor2Date,
                                                                          doctor2Time_10_12,
                                                                          doctor2Time_14_16);

        String outputDoctor1 = "Doctor № 1: " +
                               doctor1Timetable.getDoctorName() + ", " +
                               doctor1Timetable.getDoctorSpeciality() + ", " +
                               doctor1Timetable.getDateAppointment() + "\n" +
                               "Patient № 1: " +
                               doctor1Time_10_12.getPatientName() + ", " +
                               doctor1Time_10_12.getPatientDiagnose() + ", " +
                               doctor1Time_10_12.getPrice() + "\n" +
                               "Patient № 2: " +
                               doctor1Time_14_16.getPatientName() + ", " +
                               doctor1Time_14_16.getPatientDiagnose() + ", " +
                               doctor1Time_14_16.getPrice() + "\n";
        String outputDoctor2 = "Doctor № 2: " +
                               doctor2Timetable.getDoctorName() + ", " +
                               doctor2Timetable.getDoctorSpeciality() + ", " +
                               doctor2Timetable.getDateAppointment() + "\n" +
                               "Patient № 1: " +
                               doctor2Time_10_12.getPatientName() + ", " +
                               doctor2Time_10_12.getPatientDiagnose() + ", " +
                               doctor2Time_10_12.getPrice() + "\n" +
                               "Patient № 2: " +
                               doctor2Time_14_16.getPatientName() + ", " +
                               doctor2Time_14_16.getPatientDiagnose() + ", " +
                               doctor2Time_14_16.getPrice() + "\n";

        System.out.println(outputDoctor1);
        System.out.println(outputDoctor2);
    }
}
