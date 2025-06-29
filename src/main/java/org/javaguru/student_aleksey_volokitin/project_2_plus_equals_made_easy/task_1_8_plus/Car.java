package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_1_8_plus;

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
    public boolean equals(Object obj) { return (this == obj); }
}
