package org.javaguru.mentor.lesson_7_array_for.homework.solutions.level_6_senior.task_1;

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

    public String getTicker() {
        return ticker;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public double getReturnInPercents() {
        return returnInPercents;
    }
}
