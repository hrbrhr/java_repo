package org.javaguru.student_alexey_yakovlev.project_2_equals_made_easy;

import java.util.Objects;

class Car {

    private String brand;
    private String model;
    private int numberWheels;

    public Car(String brand, String model, int numberWheels) {
        this.brand = brand;
        this.model = model;
        this.numberWheels = numberWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car car)) return false;

        return numberWheels == car.numberWheels
                && Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model);
    }
}
