package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.homework.level_4_junior;

public class Stock {
    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int initialPrice) {
        this.company = company;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public String getCompany() {
        return company;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        this.minPrice = Math.min(this.minPrice, newPrice);
        this.maxPrice = Math.max(this.maxPrice, newPrice);
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
