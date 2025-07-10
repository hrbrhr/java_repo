package org.javaguru.student_pavel_gorev.lesson_4.level_4;

class Stock {
    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    // Конструктор
    public Stock(String company, int initialPrice) {
        this.company = company;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    // Метод обновления цены
    public void updatePrice(int newPrice) {
        currentPrice = newPrice;

        if (newPrice < minPrice) {
            minPrice = newPrice;
        }

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    // Геттеры
    public String getCompany() {
        return company;
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
