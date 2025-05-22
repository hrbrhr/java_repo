package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_4_junior.task_1;

class StockApp {

    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 10);

        System.out.println("Company = " + stock.getCompany());
        System.out.println("Current Price = " + stock.getCurrentCost());
        System.out.println("Min Price = " + stock.getMinCost());
        System.out.println("Max Price = " + stock.getMaxCost());

        stock.updateCost(15);
        stock.updateCost(7);
        stock.updateCost(14);

        System.out.println();

        System.out.println("Company = " + stock.getCompany());
        System.out.println("Current Price = " + stock.getCurrentCost());
        System.out.println("Min Price = " + stock.getMinCost());
        System.out.println("Max Price = " + stock.getMaxCost());
    }
}
