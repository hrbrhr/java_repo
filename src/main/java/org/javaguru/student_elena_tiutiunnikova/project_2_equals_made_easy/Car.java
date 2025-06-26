package org.javaguru.student_elena_tiutiunnikova.project_2_equals_made_easy;

import java.util.Objects;

class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

//    @Override
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        return Objects.equals(model, car.model)
                && Objects.equals(brand, car.brand);
    }
}
