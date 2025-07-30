package org.javaguru.student_grigoriy_emiliyanov.project_2_equals_made_easy.task_7.code;

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car)) return false;
        return this == o;
    }
}
