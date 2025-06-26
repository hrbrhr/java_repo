package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_2.task_4;

class CatalogCarsApp {

    public static void main(String[] args) {

        CatalogCars Car1 = new CatalogCars("Audi", "black",100);
        CatalogCars Car2 = new CatalogCars("BMW", "green",150);
        CatalogCars Car3 = new CatalogCars("Volvo", "blue",90);

        System.out.println("Brand -" + Car1.getBrand());
        System.out.println("Color -" + Car1.getColor());
        System.out.println("Price -" + Car1.getPrice() + " euro");

        System.out.println("Brand -" + Car2.getBrand());
        System.out.println("Color -" + Car2.getColor());
        System.out.println("Price -" + Car2.getPrice() + " euro");

        System.out.println("Brand -" + Car3.getBrand());
        System.out.println("Color -" + Car3.getColor());
        System.out.println("Price -" + Car3.getPrice() + " euro");

        Car1.setBrand("AlfaRomeo");
        Car1.setColor("gray");
        Car1.setPrice(155);

        Car2.setBrand("JEEP");
        Car2.setColor("brown");
        Car2.setPrice(200);


        Car3.setBrand("Ford");
        Car3.setColor("white");
        Car3.setPrice(110);

        System.out.println("Brand -" + Car1.getBrand());
        System.out.println("Color -" + Car1.getColor());
        System.out.println("Price -" + Car1.getPrice() + " euro");

        System.out.println("Brand -" + Car2.getBrand());
        System.out.println("Color -" + Car2.getColor());
        System.out.println("Price -" + Car2.getPrice() + " euro");

        System.out.println("Brand -" + Car3.getBrand());
        System.out.println("Color -" + Car3.getColor());
        System.out.println("Price -" + Car3.getPrice()+ " euro");

    }
}
