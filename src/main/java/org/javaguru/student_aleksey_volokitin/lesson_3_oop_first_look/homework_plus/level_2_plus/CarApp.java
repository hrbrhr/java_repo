package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_2_plus;

class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan Patrol", "Grey", 1111);
        Car car2 = new Car("Toyota Land Cruiser", "White", 2222);
        Car car3 = new Car("Lexus LX", "Black", 3333);

        String car1Print = car1.getBrandModel() + ", " + car1.getColor() + ", " + car1.getPrice();
        String car2Print = car2.getBrandModel() + ", " + car2.getColor() + ", " + car2.getPrice();
        String car3Print = car3.getBrandModel() + ", " + car3.getColor() + ", " + car3.getPrice() + "\n";

        System.out.println(car1Print);
        System.out.println(car2Print);
        System.out.println(car3Print);

        car1.setBrandModel("Nissan Patrol Y63");
        car1.setColor("Dark grey");
        car1.setPrice(111111);

        car2.setBrandModel("Toyota Land Cruiser 300");
        car2.setColor("Perl white");
        car2.setPrice(222222);

        car3.setBrandModel("Lexus LX 600");
        car3.setColor("Crystal black");
        car3.setPrice(333333);

        car1Print = car1.getBrandModel() + ", " + car1.getColor() + ", " + car1.getPrice();
        car2Print = car2.getBrandModel() + ", " + car2.getColor() + ", " + car2.getPrice();
        car3Print = car3.getBrandModel() + ", " + car3.getColor() + ", " + car3.getPrice();

        System.out.println(car1Print);
        System.out.println(car2Print);
        System.out.println(car3Print);
    }
}
