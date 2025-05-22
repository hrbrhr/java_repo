package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_7_senior.task_3;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Lucky", 5);

        dog.giveVoice();

        System.out.println(dog.celebrateBirthday());

        dog.tellAge();
    }
}
