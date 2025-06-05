package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_6_plus.list;

class Stock {

    private String ticker;  // stock name
    private double assetValue;
    private double returnInPercents;

    public Stock(String ticker,
                 double assetValue,
                 double returnInPercents) {
        this.ticker = ticker;
        this.assetValue = assetValue;
        this.returnInPercents = returnInPercents;
    }

    public String getTicker()           { return ticker; }
    public double getAssetValue()       { return assetValue; }
    public double getReturnInPercents() { return returnInPercents; }
}
