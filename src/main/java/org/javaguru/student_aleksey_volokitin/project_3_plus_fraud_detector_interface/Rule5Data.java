package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

class Rule5Data {
    private String startNameOfTrader;
    private String country;

    public Rule5Data(String startNameOfTrader, String country) {
        this.startNameOfTrader = startNameOfTrader;
        this.country = country;
    }

    public String getStartNameOfTrader() { return startNameOfTrader; }
    public String getCountry()          { return country; }

}
