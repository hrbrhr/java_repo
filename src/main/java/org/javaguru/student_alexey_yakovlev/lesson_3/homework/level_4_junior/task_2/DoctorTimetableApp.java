package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_2;

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
    }
}
