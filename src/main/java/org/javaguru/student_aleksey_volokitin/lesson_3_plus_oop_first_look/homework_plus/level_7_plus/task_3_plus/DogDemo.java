package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_7_plus.task_3_plus;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Shelby", 9);

        System.out.println(dog.dogVoice());

        System.out.println("My age is: " + dog.age());
        dog.dogBirthday();
        System.out.println("My age is: " + dog.age());
    }
}
