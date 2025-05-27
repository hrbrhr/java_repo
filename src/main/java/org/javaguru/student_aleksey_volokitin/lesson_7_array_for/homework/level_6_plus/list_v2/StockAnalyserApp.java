package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework.level_6_plus.list_v2;

import java.util.ArrayList;
import java.util.List;

class StockAnalyserApp {
    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("Lukoil", 1000.56, 15.5));
        stockList.add(new Stock("Sberbank", 3500.33, 12.5));
        stockList.add(new Stock("VTB", 678.12, 16.3));

        StockAnalyser stockAnalyser = new StockAnalyser();
        double sumAssetValues = stockAnalyser.findSumAssetValues(stockList);
        double averageReturnInPercents = stockAnalyser.averageReturnInPercents(stockList);

        System.out.println(sumAssetValues);
        System.out.println(averageReturnInPercents);
    }
}
