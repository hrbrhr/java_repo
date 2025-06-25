package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class Trader {

    private String fullName;
    private String city;

    public Trader (String fullName, String city) {
        this.city = city;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
