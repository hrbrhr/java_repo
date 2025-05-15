package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_4_plus;

class Stock {
    String nameCompany;
    int currentPrice;
    int maxPrice;
    int minPrice;

    Stock(String nameCompany, int currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    String getNameCompany() {return nameCompany;}
    int getCurrentPrice()   {return currentPrice;}
    int getMaxPrice()       {return maxPrice;}
    int getMinPrice()       {return minPrice;}

    void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice > this.maxPrice){
            this.maxPrice = newPrice;
        }
        if (newPrice < this.minPrice){
            this.minPrice = newPrice;
        }
    }

}
