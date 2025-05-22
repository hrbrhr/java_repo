package org.javaguru.student_anastassija.lesson_3.level_2;
public class CarApp {

    public static void main(String[] args) {

        Car car_1 = new Car("škoda", "blue", 56500);
        Car car_2 = new Car("BMW","black", 85200);
        Car car_3 = new Car("Renault", "red", 25000);


        System.out.println("1 car with parameters: " + car_1.getMark() + " " + car_1.getColour() + " " + car_1.getPrice());
        System.out.println("2 car with parameters: " + car_2.getMark() + " " + car_2.getColour() + " " + car_2.getPrice());
        System.out.println("3 car with parameters: " + car_3.getMark() + " " + car_3.getColour() + " " + car_3.getPrice());

        car_1.setMark("Opel");
        car_1.setColour("blue");
        car_1.setPrice(15000);

        car_2.setMark("Honda");
        car_2.setColour("white");
        car_2.setPrice(14000);

        car_3.setMark("Tesla");
        car_3.setColour("black");
        car_3.setPrice(130000);

        System.out.println("1 car with new parameters: " + car_1.getMark() + " " + car_1.getColour() + " " + car_1.getPrice());
        System.out.println("2 car with new parameters: " + car_2.getMark() + " " + car_2.getColour() + " " + car_2.getPrice());
        System.out.println("3 car with new parameters: " + car_3.getMark() + " " + car_3.getColour() + " " + car_3.getPrice());

       }
}


