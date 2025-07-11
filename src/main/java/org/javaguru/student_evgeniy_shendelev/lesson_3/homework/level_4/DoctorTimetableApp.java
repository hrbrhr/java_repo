package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_4;

import java.time.LocalDate;

class DoctorTimetableApp {
    public static void main(String[] args) {
        Record vasya = new Record("Vasya", "Pupkin", "Not defined", 3500);
        Record ivan = new Record("Ivan", "Ivanov", "Hernia", 4500); // это если что грыжа)
        Record akakii = new Record("Akakii", "Akakiev", "Not defined", 2500);
        Record masha = new Record("maria", "Pupkin", "Not defined", 3500);

        Appointment surgeon = new Appointment(vasya, ivan, LocalDate.of(2025, 6, 15),
                "Surgeon", "Petr", "Petrov");

        Appointment therapist = new Appointment(akakii, masha, LocalDate.of(2025, 6, 16),
                "Therapist", "Petr", "Petrov");

        System.out.println("Doctors timetable:\n" +
                surgeon.toString() + "\n" +
                therapist.toString());
    }
}
