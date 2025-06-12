package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_6_senior.task_1;

class AssetAnalysis {

    public double calculateTotalAssetValue(Stock[] stocks) {
        double totalAssetValue = 0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            totalAssetValue += stock.getAssetValue();
        }
        return totalAssetValue;
    }

    public double calculateAverageReturnPercentage(Stock[] stocks) {
        double totalAssetValue = calculateTotalAssetValue(stocks);
        double totalReturnValue = calculateTotalReturnValue(stocks);
        return (totalReturnValue * 100) / totalAssetValue;
    }

    private double calculateTotalReturnValue(Stock[] stocks) {
        double totalReturnValue = 0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            totalReturnValue += stock.getAssetValue() / 100 * stock.getReturnInPercents();
        }
        return totalReturnValue;
    }

}
