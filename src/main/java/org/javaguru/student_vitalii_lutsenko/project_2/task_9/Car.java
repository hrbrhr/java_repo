package org.javaguru.student_vitalii_lutsenko.project_2.task_9;

import java.util.Objects;

class Car {

     private String model;
     private String brand;

     public Car(String model, String brand) {
         this.model = model;
         this.brand = brand;
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
     public  final boolean equals (Object o) {
         if (this == o) return true;
         if (!(o instanceof Car car)) return false;

         return Objects.equals (model,car.model)
                 && Objects.equals(brand,car.brand);
     }
 }
