package org.javaguru.student_artjoms_babicevs.lesson_4.level_4;

public class Stock {

    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;


    public Stock(String companyName, int initialPrice) {
        this.companyName = companyName;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getCurrentPrice() {
        return this.currentPrice;
    }

    public int getMinPrice() {
        return this.minPrice;
    }

    public int getMaxPrice() {
        return this.maxPrice;
    }

}

