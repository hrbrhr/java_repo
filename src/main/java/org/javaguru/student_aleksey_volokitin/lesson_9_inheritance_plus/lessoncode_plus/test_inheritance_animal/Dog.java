package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance_plus.lessoncode_plus.test_inheritance_animal;

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }
}
