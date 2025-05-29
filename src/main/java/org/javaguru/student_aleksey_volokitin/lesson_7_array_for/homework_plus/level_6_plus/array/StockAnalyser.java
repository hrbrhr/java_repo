package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_6_plus.array;

class StockAnalyser {

    double findSumAssetValues(Stock stocks[]) {
        double sumAssetValues = 0.0d;
        for (Stock stock: stocks) {
            sumAssetValues += stock.getAssetValue();
        }
        return sumAssetValues;
    }

    double averageReturnInPercents(Stock stocks[]) {
        double sumReturnInPercents = 0.0d;
        double result = 0.0d;
        for (Stock stock: stocks) {
            sumReturnInPercents += stock.getReturnInPercents();
        }
        if(stocks.length == 0) {
            return result;
        }
        else {
            return sumReturnInPercents / (stocks.length * 1.0d);
        }
    }
}
