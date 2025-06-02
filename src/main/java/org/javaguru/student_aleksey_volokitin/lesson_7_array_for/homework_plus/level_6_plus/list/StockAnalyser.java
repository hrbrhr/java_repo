package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_6_plus.list;

import java.util.ArrayList;
import java.util.List;

class StockAnalyser {

    private List<Stock> stocks = new ArrayList<>();

    void addStock (String ticker,         // создаем void метод по добавлению элементов в список
                   double assetValue,
                   double returnInPercents) {

        Stock stock = new Stock(ticker, assetValue, returnInPercents); // создаем новый объект Stock
        stocks.add(stock); // добавляем объект stock в список
    }

    double findSumAssetValues() {
        double sumAssetValues = 0.0d;
        for (int i = 0; i < stocks.size(); i++) { // цикл длиной в количество элементов списка (size)
            Stock stock = stocks.get(i); // создаем новый объект из объекта i-го элемента списка
            sumAssetValues += stock.getAssetValue();
        }
        return sumAssetValues;
    }

    double averageReturnInPercents() {
        double sumReturnInPercents = 0.0d;
        double result = 0.0d;
        for (int i = 0; i < stocks.size(); i++) { // цикл длиной в количество элементов списка (size)
            Stock stock = stocks.get(i); // создаем новый объект из объекта i-го элемента списка
            sumReturnInPercents += stock.getReturnInPercents();
        }
        if(stocks.isEmpty()) {
            return result;
        }
        else {
            return sumReturnInPercents / (stocks.size() * 1.0d);
        }
    }
}
