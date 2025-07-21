package org.javaguru.student_vasilii_khvan.lesson_4.level_4.task_1;

class Stock {
    private String companyName;
    private int price;
    private int minPrice;
    private int maxPrice;

    Stock(String companyName, int price) {
        this.companyName = companyName;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    void updatePrice(int newPrice) {
        price = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    String getCompanyName() {
        return companyName;
    }

    int getPrice() {
        return price;
    }

    int getMinPrice() {
        return minPrice;
    }

    int getMaxPrice() {
        return maxPrice;
    }
}
