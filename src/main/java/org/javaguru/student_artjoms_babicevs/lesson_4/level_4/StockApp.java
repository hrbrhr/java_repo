package org.javaguru.student_artjoms_babicevs.lesson_4.level_4;

public class StockApp {

    public static void main(String[] args) {
        Stock stock = new Stock("OpenAI", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);

        System.out.println("Company name: " + stock.getCompanyName());
        System.out.println("Current price: " + stock.getCurrentPrice());
        System.out.println("Min price: " + stock.getMinPrice());
        System.out.println("Max price: " + stock.getMaxPrice());
    }
}



