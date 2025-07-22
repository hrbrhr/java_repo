package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_4_junior;

public class Visit {
    private Patient patient;
    private int price;

    private String diagnosis = null;

    public Visit(Patient patient, int price) {
        this.patient = patient;
        this.price = price;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "patient=" + patient +
                ", price=" + price +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
