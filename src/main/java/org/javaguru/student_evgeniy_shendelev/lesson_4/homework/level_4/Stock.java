package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_4;

class Stock {
    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
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

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "\nname='" + name + '\'' +
                ", \ncurrentPrice=" + currentPrice +
                ", \nminPrice=" + minPrice +
                ", \nmaxPrice=" + maxPrice +
                '}';
    }
}
