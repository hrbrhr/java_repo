package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_3;

class DoctorAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int visitCost;

    public DoctorAppointment(String patientFirstName, String patientLastName, String diagnosis, int visitCost) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.visitCost = visitCost;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getVisitCost() {
        return visitCost;
    }
}
