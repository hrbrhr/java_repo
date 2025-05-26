package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class Rule1Data {
    private String fullNameOfTrader;
    private int maxThresholdAmount;

    public Rule1Data(String fullNameOfTrader, int maxThresholdValue) {
        this.fullNameOfTrader = fullNameOfTrader;
        this.maxThresholdAmount = maxThresholdValue;
    }

    public String getFullNameOfTrader() { return fullNameOfTrader; }
    public int getMaxThresholdAmount()   { return maxThresholdAmount; }
}
