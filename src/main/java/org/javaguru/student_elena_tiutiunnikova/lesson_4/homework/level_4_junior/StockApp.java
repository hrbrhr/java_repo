package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_4_junior;

class StockApp {
    public static void main(String[] args) {

        Stock stockApple = new Stock("AAPL", 205);

        System.out.println("Company = " + stockApple.getName());
        System.out.println("Current Price = " + stockApple.getCurrentPrice());
        System.out.println("Min Price = " + stockApple.getMinPrice());
        System.out.println("Max Price = " + stockApple.getMaxPrice());

        stockApple.updatePrice(250);
        stockApple.updatePrice(199);
        stockApple.updatePrice(215);

        System.out.println("Company = " + stockApple.getName());
        System.out.println("Current Price = " + stockApple.getCurrentPrice());
        System.out.println("Min Price = " + stockApple.getMinPrice());
        System.out.println("Max Price = " + stockApple.getMaxPrice());

    }

}
