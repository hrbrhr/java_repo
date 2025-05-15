package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_new;

class Trader {

    private String fullName;
    private String city;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    String getFullName() { return fullName; }
    String getCity()     { return city; }
}

