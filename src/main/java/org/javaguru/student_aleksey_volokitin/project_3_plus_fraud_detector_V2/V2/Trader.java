package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    String getFullName() { return fullName; }
    String getCity()     { return city; }
    String getCountry()     { return country; }
}

