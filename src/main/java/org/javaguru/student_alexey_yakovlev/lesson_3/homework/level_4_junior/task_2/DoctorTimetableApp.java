package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_2;

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
    }
}
