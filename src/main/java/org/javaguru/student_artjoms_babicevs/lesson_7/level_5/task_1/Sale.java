package org.javaguru.student_artjoms_babicevs.lesson_7.level_5.task_1;

class Sale {

    private String product;
    private double pricePerUnit;
    private int unitCount;

    public Sale(String product, double pricePerUnit, int unitCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.unitCount = unitCount;
    }

    public String getProduct() {
        return product;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getUnitCount() {
        return unitCount;
    }
}