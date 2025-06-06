package org.javaguru.student_vitalii_lutsenko.lesson_2.homework.level_2.task_3;

class CatalogCarsApp {

    public static void main(String[] args) {

        CatalogCars Car1 = new CatalogCars("Audi", "Black",100);
        CatalogCars Car2 = new CatalogCars("BMW", "Green",150);
        CatalogCars Car3 = new CatalogCars("Volvo", "Blue",90);

        System.out.println("Brand " + Car1.getBrand());
        System.out.println("Color " + Car1.getColor());
        System.out.println("Price " + Car1.getPrice());

        System.out.println("Brand " + Car2.getBrand());
        System.out.println("Color " + Car2.getColor());
        System.out.println("Price " + Car2.getPrice());

        System.out.println("Brand " + Car3.getBrand());
        System.out.println("Color " + Car3.getColor());
        System.out.println("Price " + Car3.getPrice());
    }
}
