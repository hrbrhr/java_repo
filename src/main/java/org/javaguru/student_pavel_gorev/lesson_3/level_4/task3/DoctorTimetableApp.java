package org.javaguru.student_pavel_gorev.lesson_3.level_4.task3;

class DoctorTimetableApp {
    public static void main(String[] args) {
        Appointment morning = new Appointment("Анна", "Иванова", "Кариес", 2000);
        Appointment afternoon = new Appointment("Петр", "Петров", "Пульпит", 3000);

        DoctorTimetable doctor = new DoctorTimetable(
                "Алексей", "Смирнов", "Стоматолог", "2025-05-26", morning, afternoon
        );

        System.out.println("Врач: " + doctor.getDoctorFirstName() + " " + doctor.getDoctorLastName());
        System.out.println("Специальность: " + doctor.getSpecialty());
        System.out.println("Дата приёма: " + doctor.getAppointmentDate());

        System.out.println("\nУтренний приём (10:00-12:00):");
        Appointment m = doctor.getMorningAppointment();
        System.out.println("Пациент: " + m.getPatientFirstName() + " " + m.getPatientLastName());
        System.out.println("Диагноз: " + m.getDiagnosis());
        System.out.println("Стоимость: " + m.getCost());

        System.out.println("\nДневной приём (14:00-16:00):");
        Appointment a = doctor.getAfternoonAppointment();
        System.out.println("Пациент: " + a.getPatientFirstName() + " " + a.getPatientLastName());
        System.out.println("Диагноз: " + a.getDiagnosis());
        System.out.println("Стоимость: " + a.getCost());
    }
}
