package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_3;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {
        DoctorAppointment doctorAppointment1 = new DoctorAppointment(
                "Ivan", "Ivanov", "toothache", 5_000
        );

        DoctorAppointment doctorAppointment2 = new DoctorAppointment(
                "Petr", "Petrov", "toothExtraction", 10_000
        );

        DoctorTimetable timetable = new DoctorTimetable(
                "Alexander",
                "Alexandrov",
                "dentist",
                new Date(),
                doctorAppointment1, doctorAppointment2
        );

        System.out.println("Patient first name: " + doctorAppointment1.getPatientFirstName() + ",\n" +
                "Patient last name: " + doctorAppointment1.getPatientLastName() + ",\n" +
                "Diagnosis: " + doctorAppointment1.getDiagnosis() + ",\n" +
                "Cost: " + doctorAppointment1.getVisitCost() + "\n"
        );

        System.out.println("Doctor first name: " + timetable.getDoctorFirstname() + ",\n" +
                "Doctor last name: " + timetable.getDoctorLastname() + ",\n" +
                "Doctor speciality: " + timetable.getDoctorSpeciality() + ",\n" +
                "Appointment date: " + timetable.getAppointmentDate()
        );

        System.out.println("Appointment 2 diagnose: " + doctorAppointment2.getDiagnosis());
    }
}
