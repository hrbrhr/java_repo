package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_4_junior.task_1;

class Stock {

    private String company;
    private int currentCost;
    private int minCost;
    private int maxCost;

    public Stock(String company, int currentCost) {
        this.company = company;
        this.currentCost = currentCost;
    }

    public String getCompany() {
        return company;
    }

    public int getCurrentCost() {
        return currentCost;
    }

    public int getMinCost() {
        return minCost;
    }

    public int getMaxCost() {
        return maxCost;
    }

    void updateCost(int newCost) {
        if (newCost < currentCost) {
            minCost = newCost;
        }
        if (newCost > currentCost) {
            maxCost = newCost;
        }
    }
}
