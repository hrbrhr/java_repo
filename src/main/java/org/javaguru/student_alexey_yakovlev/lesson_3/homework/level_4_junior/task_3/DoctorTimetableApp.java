package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_3;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {
        DoctorAppointment appointment1 = new DoctorAppointment(
                "Ivan", "Ivanov", "toothache", 5_000
        );

        DoctorAppointment appointment2 = new DoctorAppointment(
                "Petr", "Petrov", "toothExtraction", 7_000
        );

        DoctorTimetable timetable = new DoctorTimetable(
                "Alexander",
                "Alexandrovich",
                "dentist",
                new Date(),
                appointment1, appointment2
        );

        System.out.println("Patient first name: " + appointment1.getPatientFirstName() + "\n" +
                "Patient last name: " + appointment1.getPatientLastName() + "\n" +
                "Diagnosis: " + appointment1.getDiagnosis() + "\n" +
                "Cost: " + appointment1.getCost() + "\n"
        );

        System.out.println("Doctor first name: " + timetable.getDoctorFirstName() + "\n" +
                "Doctor last name: " + timetable.getDoctorLastName() + "\n" +
                "Doctor specialty: " + timetable.getDoctorSpecialty() + "\n\n" +
                "Appointment date: " + timetable.getAppointmentDate() + "\n" +
                timetable.getAppointment1().getPatientFirstName()
        );

    }
}
