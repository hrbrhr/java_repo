package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_5_plus;

class Sale {

    private String product;
    private double pricePerUnit;
    private int unitCount;

    Sale(String product, double pricePerUnit, int unitCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.unitCount = unitCount;
    }

    String getProduct()      { return product; }
    double getPricePerUnit() { return pricePerUnit; }
    int    getUnitCount()    { return unitCount; }
}