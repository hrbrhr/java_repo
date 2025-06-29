package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_9_plus;

import java.util.Objects;

class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(brand, car.brand)
            && Objects.equals(model, car.model);
    }
}
