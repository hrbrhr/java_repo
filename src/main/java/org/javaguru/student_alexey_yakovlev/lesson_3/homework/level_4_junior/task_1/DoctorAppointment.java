package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_4_junior.task_1;

import com.sun.jdi.request.StepRequest;

class DoctorAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int cost;

    public DoctorAppointment(String patientFirstName, String patientLastName, String diagnosis, int cost) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }
}
