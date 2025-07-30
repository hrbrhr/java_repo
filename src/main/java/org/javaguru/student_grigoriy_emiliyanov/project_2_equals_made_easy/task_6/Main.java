package org.javaguru.student_grigoriy_emiliyanov.project_2_equals_made_easy.task_6;

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal animal = new Animal();
        if (dog instanceof Dog) {
            System.out.println("dog is Dog");
        }
        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }
        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }
        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
//        Dog dog2 = (Dog) animal;
        Dog dog3 = (Dog) dog;
    }
}
