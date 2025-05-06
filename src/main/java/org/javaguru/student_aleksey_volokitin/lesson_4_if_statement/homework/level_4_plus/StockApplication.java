package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_4_plus;

class StockApplication {
    public static void main(String[] args) {

        // 10 -> 12 -> 5 -> 7 -> 99 -> 77
        Stock stock1 = new Stock("Google", 10);

        String infoString = "Company: " + stock1.getNameCompany() +
                            ", current price: " + stock1.getCurrentPrice() +
                            ", min price: " + stock1.getMinPrice() +
                            ", max price: " + stock1.getMaxPrice() +
                            ".\n";
        System.out.print(infoString);

        stock1.updatePrice(12);
        infoString = "Company: " + stock1.getNameCompany() +
                     ", current price: " + stock1.getCurrentPrice() +
                     ", min price: " + stock1.getMinPrice() +
                     ", max price: " + stock1.getMaxPrice() +
                     ".\n";
        System.out.print(infoString);

        stock1.updatePrice(5);
        infoString = "Company: " + stock1.getNameCompany() +
                ", current price: " + stock1.getCurrentPrice() +
                ", min price: " + stock1.getMinPrice() +
                ", max price: " + stock1.getMaxPrice() +
                ".\n";
        System.out.print(infoString);

        stock1.updatePrice(7);
        infoString = "Company: " + stock1.getNameCompany() +
                ", current price: " + stock1.getCurrentPrice() +
                ", min price: " + stock1.getMinPrice() +
                ", max price: " + stock1.getMaxPrice() +
                ".\n";
        System.out.print(infoString);

        stock1.updatePrice(99);
        infoString = "Company: " + stock1.getNameCompany() +
                ", current price: " + stock1.getCurrentPrice() +
                ", min price: " + stock1.getMinPrice() +
                ", max price: " + stock1.getMaxPrice() +
                ".\n";
        System.out.print(infoString);

        stock1.updatePrice(77);
        infoString = "Company: " + stock1.getNameCompany() +
                ", current price: " + stock1.getCurrentPrice() +
                ", min price: " + stock1.getMinPrice() +
                ", max price: " + stock1.getMaxPrice() +
                ".\n";
        System.out.print(infoString);
    }
}
