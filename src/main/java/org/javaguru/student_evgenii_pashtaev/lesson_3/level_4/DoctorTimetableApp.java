package org.javaguru.student_evgenii_pashtaev.lesson_3.level_4;

public class DoctorTimetableApp {

    public static void main(String[] args) {


        PatientVisit visitMorning = new PatientVisit("Lubov", "Kablukova", "cold", 100);
        PatientVisit visitAfternoon = new PatientVisit("Nikolai", "Bochkin", "cold", 200);

        Doctor docOne = new Doctor("Oleg", "Ivanov", "terapist", "15.05.2025", visitMorning);
        Doctor docTwo = new Doctor("Olga", "Petrova", "surgeon", "15.05.2025", visitAfternoon);

        System.out.println(docOne.getName() + " " + docOne.getSurname() + " " + docOne.getSpec() + " " + docOne.getDate() + " " + docOne.getPatientNameMorning() + " " + docOne.getPatientSurnameMorning() + " " + docOne.getPatientDiagnosisMorning() + " " + docOne.getVisitCostMorning());
        //System.out.println(docTwo.getName() + " " + docTwo.getSurname() + " " + docTwo.getSpec() + " " + docTwo.getDate() + " " + docTwo.getPatientNameAfternoon() + " " + docTwo.getPatientSurnameAfternoon() + " " + docTwo.getPatientDiagnosisAfternoon() + " " + docTwo.getVisitCostAfternoon());
    }
}
