package org.javaguru.student_vitalii_lutsenko.project_2.task_3;

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
     public boolean equals (Object obj) {
         return (this == obj);
     }
 }
