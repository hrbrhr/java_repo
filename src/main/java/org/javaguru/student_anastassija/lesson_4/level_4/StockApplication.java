package org.javaguru.student_anastassija.lesson_4.level_4;

class StockApplication {

    public static void main(String[] args) {

        StockShares companyName = new StockShares("Swedbank", 10);

        System.out.println("Company = " + companyName.getCompanyName());
        System.out.println("Current Price = " + companyName.getSharePrice());
        System.out.println("Min Price = " + companyName.getMinimumPrice());
        System.out.println("Max Price = " + companyName.getMaximumPrice());

    //10 -> 12 -> 5 -> 7 -> 99 -> 77
        companyName.upPrice(12);
        companyName.upPrice(5);
        companyName.upPrice(7);
        companyName.upPrice(99);
        companyName.upPrice(77);

        System.out.println("Company = " + companyName.getCompanyName());
        System.out.println("Current Price = " + companyName.getSharePrice());
        System.out.println("Min Price = " + companyName.getMinimumPrice());
        System.out.println("Max Price = " + companyName.getMaximumPrice());

    }
}
