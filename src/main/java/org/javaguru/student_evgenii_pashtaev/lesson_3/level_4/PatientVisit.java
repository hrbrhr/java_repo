package org.javaguru.student_evgenii_pashtaev.lesson_3.level_4;

public class PatientVisit {

    String patientName;
    String patientSurname;
    String patientDiagnosis;
    int visitCost;

    public PatientVisit(String patientName, String patientSurname, String patientDiagnosis, int visitCost){

        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientDiagnosis = patientDiagnosis;
        this.visitCost = visitCost;
    }
    public String getPatientName(){
        return this.patientName;
    }

    public String getPatientSurname(){
        return this.patientSurname;
    }

    public String getPatientDiagnosis(){
        return this.patientDiagnosis;
    }

    public int getVisitCost(){
        return this.visitCost;
    }

}
