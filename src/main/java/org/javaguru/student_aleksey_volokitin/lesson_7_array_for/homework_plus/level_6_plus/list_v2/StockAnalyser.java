package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_6_plus.list_v2;

import java.util.List;

class StockAnalyser {

    double findSumAssetValues(List<Stock> stockList) {
        double sumAssetValues = 0.0d;
        for (int i = 0; i < stockList.size(); i++) { // цикл длиной в количество элементов списка (size)
            Stock stock = stockList.get(i); // создаем новый объект из объекта i-го элемента списка
            sumAssetValues += stock.getAssetValue();
        }
        return sumAssetValues;
    }

    double averageReturnInPercents(List<Stock> stockList) {
        double sumReturnInPercents = 0.0d;
        double result = 0.0d;
        for (int i = 0; i < stockList.size(); i++) { // цикл длиной в количество элементов списка (size)
            Stock stock = stockList.get(i); // создаем новый объект из объекта i-го элемента списка
            sumReturnInPercents += stock.getReturnInPercents();
        }
        if(stockList.isEmpty()) {
            return result;
        }
        else {
            return sumReturnInPercents / (stockList.size() * 1.0d);
        }
    }
}
