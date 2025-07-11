package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_2;

class CarApp {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "white", 6_700_000);
        Car toyota = new Car("Toyota", "perl", 4_800_000);
        Car alfaRomeo = new Car("Alfa Romeo", "red", 8_300_000);

        System.out.printf("Label: %s, Color: %s, Price: %d%n", bmw.getLabel(), bmw.getColor(), bmw.getPrice());
        System.out.printf("Label: %s, Color: %s, Price: %d%n", toyota.getLabel(), toyota.getColor(), toyota.getPrice());
        System.out.printf("Label: %s, Color: %s, Price: %d%n", alfaRomeo.getLabel(), alfaRomeo.getColor(), alfaRomeo.getPrice());

        bmw.setLabel("Bayerische Motoren Werke");
        bmw.setColor("blue");
        bmw.setPrice(10_399_999);

        toyota.setLabel("Toyota Motor Corporation");
        toyota.setColor("white-black");
        toyota.setPrice(12_359_349);

        alfaRomeo.setLabel("Anonima Lombarda Fabbrica Automobili");
        alfaRomeo.setColor("dark blue");
        alfaRomeo.setPrice(18_999_999);

        System.out.printf("Label: %s, Color: %s, Price: %d%n", bmw.getLabel(), bmw.getColor(), bmw.getPrice());
        System.out.printf("Label: %s, Color: %s, Price: %d%n", toyota.getLabel(), toyota.getColor(), toyota.getPrice());
        System.out.printf("Label: %s, Color: %s, Price: %d%n", alfaRomeo.getLabel(), alfaRomeo.getColor(), alfaRomeo.getPrice());
    }
}
