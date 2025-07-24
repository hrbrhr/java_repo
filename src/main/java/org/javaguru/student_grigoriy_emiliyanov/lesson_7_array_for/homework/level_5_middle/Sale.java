package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_5_middle;

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

    @Override
    public String toString() {
        return "Sale{" +
                "product='" + product + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", unitCount=" + unitCount +
                '}';
    }
}