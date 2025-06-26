package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_6;

class Portfolio {
    Stock[] portfolio;
    int count = -1;
    Portfolio(){
        this.portfolio = new Stock[5];
    }

    public void addStock(String name, double value, double percent){
        Stock stock1 = new Stock(name, value, percent);
        portfolio[increment()] = stock1;
    }

    public int increment(){
        count++;
        return count;
    }

    public double getSumCost(){
        double sumcost = 0;
        for(int i = 0; i < portfolio.length; i ++){
            sumcost += portfolio[i].getAssetValue();
        }
        return sumcost;
    }
    public double getMiddleMoney(){
        double sumPercent = 0;
        double middleMoney;

        for (int i = 0; i < portfolio.length; i++){
            sumPercent += portfolio[i].getReturnInPercents();
        }
        middleMoney = sumPercent/portfolio.length;
        return middleMoney;
    }
}
