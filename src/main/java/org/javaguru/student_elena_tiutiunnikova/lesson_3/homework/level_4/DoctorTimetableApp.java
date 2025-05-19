package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_4;

public class DoctorTimetableApp {
    public static void main(String[] args) {
        DoctorTimetable doctor1 = new DoctorTimetable("Petrova", "Pediatrician", "16.05.2025", null,"14:00-16:00");
        DoctorTimetable doctor2 = new DoctorTimetable("Sidorov", "Ophthalmologist", "17.05.2025", null, "14:00-16:00");

        Appointment patient1 = new Appointment("Kozlov", "Rash", 55);
        Appointment patient2 = new Appointment("Portnova","Strabismus", 40);

        System.out.println("Doctor: " + doctor1.getDoctor());
        System.out.println("Specialty: " + doctor1.getSpecialty());
        System.out.println("Data: " + doctor1.getData());
        System.out.println("Time: " + doctor1.getAfternoonTime());
        System.out.println("Time: " + doctor1.getMorningTime());

        System.out.println("Patient: "+ patient1.getPatient());
        System.out.println("Diagnosis: " + patient1.getDiagnosis());
        System.out.println("Price: " + patient1.getPrice());

        System.out.println("Doctor: " + doctor2.getDoctor());
        System.out.println("Specialty: " + doctor2.getSpecialty());
        System.out.println("Data: " + doctor2.getData());
        System.out.println("Time: " + doctor2.getAfternoonTime());
        System.out.println("Time: " + doctor2.getMorningTime());

        System.out.println("Patient: "+ patient2.getPatient());
        System.out.println("Diagnosis: " + patient2.getDiagnosis());
        System.out.println("Price: " + patient2.getPrice());

    }
}
