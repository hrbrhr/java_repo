package org.javaguru.student_vasilii_khvan.lesson_4.level_4.task_1;

class StockApp {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.updatePrice(20);
        google.updatePrice(1);
        google.updatePrice(4);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }
}
