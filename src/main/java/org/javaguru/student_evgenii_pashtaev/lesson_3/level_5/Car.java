package org.javaguru.student_evgenii_pashtaev.lesson_3.level_5;
/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Car.
*/
class Car {

    private String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;

    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
