package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class Rule3Data {
    private String city;
    private int maxThresholdValue;

    public Rule3Data(String city, int maxThresholdValue) {
        this.city = city;
        this.maxThresholdValue = maxThresholdValue;
    }

    public String getCity()           { return city; }
    public int getMaxThresholdValue() { return maxThresholdValue; }
}
