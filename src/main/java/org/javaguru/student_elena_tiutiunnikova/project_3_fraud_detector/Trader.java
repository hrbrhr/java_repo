package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader (String fullName, String city, String country) {
        this.city = city;
        this.fullName = fullName;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
