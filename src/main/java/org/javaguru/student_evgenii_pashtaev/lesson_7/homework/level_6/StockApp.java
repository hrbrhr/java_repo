package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_6;

public class StockApp {

    public static void main(String[] args){
        Portfolio port1 = new Portfolio();
        port1.addStock("Water", 20, 3.5);
        port1.addStock("Threes", 24, 1.2);
        port1.addStock("Glass", 30, 3.4);
        port1.addStock("Cat", 35, 2.8);
        port1.addStock("Dog", 40, 3.1);

        double middleResult = port1.getMiddleMoney();
        double sumCost = port1.getSumCost();

        System.out.println(middleResult);
        System.out.println(sumCost);

        System.out.println(port1.portfolio[4].getTicker());

    }
}
