package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_4;

public class StockApplication {

    public static void main(String[] args) {
        Stock stock = new Stock("Rafik", 10);

        System.out.println("Company = " + stock.getCompany());
        System.out.println("Current Price = " + stock.getCurrent());
        System.out.println("Min Price = " + stock.getMin());
        System.out.println("Max Price = " + stock.getMax());

        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);

        System.out.println("Company = " + stock.getCompany());
        System.out.println("Current Price = " + stock.getCurrent());
        System.out.println("Min Price = " + stock.getMin());
        System.out.println("Max Price = " + stock.getMax());


    }




}
