package org.javaguru.student_vasilii_khvan.lesson_3.level_2;

public class CarApp {

    public static void main(String[] args) {
        Car chevrolet = new Car("Chevrolet", "White", 1000);
        Car kia = new Car("KIA", "Black", 2000);
        Car bmw = new Car("BMW", "Blue", 3000);

        System.out.println(chevrolet.getBrand());
        System.out.println(chevrolet.getColor());
        System.out.println(chevrolet.getPrice());
        System.out.println();

        System.out.println(kia.getBrand());
        System.out.println(kia.getColor());
        System.out.println(kia.getPrice());
        System.out.println();

        System.out.println(bmw.getBrand());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getPrice());
        System.out.println();

        chevrolet.setBrand("Ford");
        chevrolet.setColor("Black");
        chevrolet.setPrice(10000);

        kia.setBrand("Hyundai");
        kia.setColor("White");
        kia.setPrice(20000);

        bmw.setBrand("Mercedes");
        bmw.setColor("Red");
        bmw.setPrice(30000);

        System.out.println(chevrolet.getBrand());
        System.out.println(chevrolet.getColor());
        System.out.println(chevrolet.getPrice());
        System.out.println();

        System.out.println(kia.getBrand());
        System.out.println(kia.getColor());
        System.out.println(kia.getPrice());
        System.out.println();

        System.out.println(bmw.getBrand());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getPrice());
    }
}
