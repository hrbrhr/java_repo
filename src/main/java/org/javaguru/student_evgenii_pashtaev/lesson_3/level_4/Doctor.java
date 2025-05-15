package org.javaguru.student_evgenii_pashtaev.lesson_3.level_4;

public class Doctor {
    String name;
    String surname;
    String spec;
    String date;
    private PatientVisit visitMorning;
    private PatientVisit visitAfternoon;

    public Doctor(String name, String surname, String spec, String date, PatientVisit visitMorning, PatientVisit visitAfternoon) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.date = date;
        this.visitMorning = visitMorning;
        this.visitAfternoon = visitAfternoon;
    }

    public Doctor(String name, String surname, String spec, String date, PatientVisit visitMorning) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.date = date;
        this.visitMorning = visitMorning;
    }

    public Doctor(String name, String surname, String spec, String date) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSpec() {
        return this.spec;
    }

    public String getDate(){
        return this.date;
    }

    public String getPatientNameMorning(){
        return visitMorning.patientName;
    }

    public String getPatientNameAfternoon(){
        return visitAfternoon.patientName;
    }

    public String getPatientSurnameMorning(){
        return visitMorning.patientSurname;
    }

    public String getPatientSurnameAfternoon(){
        return visitAfternoon.patientSurname;
    }

    public String getPatientDiagnosisMorning(){
        return visitMorning.patientDiagnosis;
    }

    public int getVisitCostMorning(){
        return visitMorning.visitCost;
    }

    public String getPatientDiagnosisAfternoon(){
        return visitAfternoon.patientDiagnosis;
    }

    public int getVisitCostAfternoon(){
        return visitAfternoon.visitCost;
    }
}
