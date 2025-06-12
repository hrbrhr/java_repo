package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_6_senior;

class StockApp {
//    Вам поручили произвести анализ инвестиционного портфеля.
//    В инвестиционный портфель входят акции. Каждая акция
//    представлена классом Stock (лежит рядом с заданием).
//    В программе инвестиционный портфель представлен массивом
//    объектов класса Stock.
//
//    Вам нужно вычислить:
//- общую стоимость портфеля (сумма всех assetValue);
//- среднюю доходность портфеля.
//
//    Создайте программу и докажите правильность ее работы при помощи
//    автоматических тестов.

    private boolean investmentPortfolioIsNullOrEmpty (Stock[] stocks) {
        return (stocks == null) || (stocks.length == 0);
    }

    public double totalValueOfStocks (Stock[] stocks) {
        double totalValue = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            totalValue += stocks[i].getAssetValue();
        }
        return totalValue;
    }

    public double averageReturnOnInvestmentPortfolio (Stock[] stocks) {
        double totalValue = totalValueOfStocks(stocks);
        double averageReturn = 0.0;
            for (int i = 0; i < stocks.length; i++) {
            double returnStock = (stocks[i].getReturnInPercents()/100) * (stocks[i].getAssetValue()/totalValue)*100;
            averageReturn = averageReturn + returnStock;
        } return averageReturn;
    }



}
