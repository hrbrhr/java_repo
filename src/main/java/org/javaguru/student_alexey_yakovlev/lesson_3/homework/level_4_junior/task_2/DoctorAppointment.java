package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_2;

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
}
