package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_4_junior;

class Appointment {
    private String patient;
    private String diagnosis;
    private double price;

    Appointment (String namePatient, String diagnosis, double price) {
        this.patient = namePatient;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getPatient () {return patient;}
    public String getDiagnosis () {return diagnosis;}
    public double getPrice () {return price;}
}
