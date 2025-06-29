package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_10_plus;

import java.util.Objects;

class Car {

    private String brand;
    private String model;
    private int enginePower;

    public Car(String brand, String model, int enginePower) {
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
    }

    public String getBrand()    { return brand; }
    public String getModel()    { return model; }
    public int getEnginePower() { return enginePower; }

    public void setBrand(String brand)          { this.brand = brand; }
    public void setModel(String model)          { this.model = model; }
    public void setEnginePower(int enginePower) { this.enginePower = enginePower; }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if (!(o instanceof Car car)) return false;
        return enginePower == car.enginePower
            && Objects.equals(brand, car.brand)
            && Objects.equals(model, car.model);
    }
}
