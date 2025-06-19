package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_animal;

class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Shelby");
        Cat cat = new Cat("Cat");

        AnimalBarbershop animalBarbershop = new AnimalBarbershop();

        dog.voice();
        animalBarbershop.shear(dog);
        cat.voice();
        animalBarbershop.shear(cat);
    }
}
