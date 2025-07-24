package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_6_senior;

import java.util.Arrays;

class StocksAnalyzer {

    public double findTotalValue(Stock[] stocks) {
        return Arrays.stream(stocks).map(Stock::getAssetValue).reduce(0.0, Double::sum);
    }

    public double findAverageRIP(Stock[] stocks) {
       if (stocks.length == 0) return 0.0;
       double weightedValues = 0.0;
       for (Stock stock : stocks) {
           weightedValues += stock.getAssetValue() * stock.getReturnInPercents();
       }
       double totalValues = findTotalValue(stocks);
       return weightedValues / totalValues;
    }

}
