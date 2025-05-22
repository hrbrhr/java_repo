package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_4_junior;

class Stock {
    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock (String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice (int newPrice) {
        this.currentPrice = newPrice;

        if (newPrice<minPrice) {
            minPrice = newPrice;
        }

        if (newPrice>maxPrice) {
            maxPrice = newPrice;
        }
    }

    public String getName() {
        return name;
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
