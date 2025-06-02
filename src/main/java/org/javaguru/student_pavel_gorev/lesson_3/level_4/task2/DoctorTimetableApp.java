package org.javaguru.student_pavel_gorev.lesson_3.level_4.task2;

class DoctorTimetableApp {
    public static void main(String[] args) {
        // Первый визит (стоматолог)
        Appointment afternoonAppt1 = new Appointment("Иванов", "Иван",  "Кариес", 1500.0);
        Appointment afternoonAppt2 = new Appointment("Петров", "Петр", "Пульпит", 2500.0);

        DoctorTimetable dentistSchedule = new DoctorTimetable(
                "Смирнов", "Алексей", "Стоматолог", "2025-05-26",
                afternoonAppt1, afternoonAppt2
        );
    }
}
