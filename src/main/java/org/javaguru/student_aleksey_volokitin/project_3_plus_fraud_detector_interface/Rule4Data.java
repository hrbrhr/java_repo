package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

class Rule4Data {
    private String country;
    private int maxThresholdValue;

    public Rule4Data(String country, int maxThresholdValue) {
        this.country = country;
        this.maxThresholdValue = maxThresholdValue;
    }

    public String getCountry()        { return country; }
    public int getMaxThresholdValue() { return maxThresholdValue; }
}
