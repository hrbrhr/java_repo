package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_4_plus;

class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 9, "Motley");
        Dog dog = new Dog("Dog", 6, "Grey");

        cat.getVoice();
        dog.getVoice();
    }
}
