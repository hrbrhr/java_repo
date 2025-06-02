package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_6_plus.array;

class StockAnalyserApp {
    public static void main(String[] args) {
        Stock stocks[] = {new Stock("Lukoil", 1000.56, 15.5),
                          new Stock("Sberbank", 3500.33, 12.5),
                          new Stock("VTB", 678.12, 16.3)};

        StockAnalyser stockAnalyser = new StockAnalyser();
        double sumAssetValues = stockAnalyser.findSumAssetValues(stocks);
        double averageReturnInPercents = stockAnalyser.averageReturnInPercents(stocks);

        System.out.println(sumAssetValues);
        System.out.println(averageReturnInPercents);

    }



}
