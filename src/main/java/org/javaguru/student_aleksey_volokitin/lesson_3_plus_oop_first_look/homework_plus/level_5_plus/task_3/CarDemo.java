package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_5_plus.task_3;

class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
