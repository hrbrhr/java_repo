package org.javaguru.student_pavel_gorev.lesson_3.level_4.task3;

class Appointment {
    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private double cost;

    public Appointment(String patientFirstName, String patientLastName, String diagnosis, double cost) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.cost = cost;
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

    public double getCost() {
        return cost;
    }
}
