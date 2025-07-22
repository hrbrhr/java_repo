package org.javaguru.student_vitalii_lutsenko.project_2;

import java.util.Objects;

class Car {

     private String model;
     private String brand;
     private int year;


     public Car(String model, String brand, int year) {
         this.model = model;
         this.brand = brand;
         this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year);
    }
}
