package org.javaguru.student_vasilii_khvan.lesson_3.level_4;

class Appointment {

    private String name;
    private String diagnosis;
    private int price;

    Appointment(String name, String diagnosis, int price) {
        this.name = name;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getDiagnosis() {
        return diagnosis;
    }

    int getPrice() {
        return price;
    }
}
