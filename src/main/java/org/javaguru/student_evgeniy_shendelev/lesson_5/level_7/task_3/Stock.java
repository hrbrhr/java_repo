package org.javaguru.student_evgeniy_shendelev.lesson_5.level_7.task_3;

class Stock {
    private String name;
    private double[] prices;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, int stockPriceCount) {
        this.name = name;
        prices = new double[stockPriceCount];
    }

    public void setCurrentPrice(double currentPrice, int idx) {
        this.currentPrice = currentPrice;
        if (minPrice == 0) minPrice = currentPrice;
        if (maxPrice == 0) maxPrice = currentPrice;
        prices[idx] = currentPrice;

        if (maxPrice < currentPrice) {
            maxPrice = currentPrice;
        } else if (minPrice > currentPrice) {
            minPrice = currentPrice;
        }
    }

    public double getAvgPrice() {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / prices.length;
    }

    public String getName() {
        return name;
    }

    public double[] getPrices() {
        return prices;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
