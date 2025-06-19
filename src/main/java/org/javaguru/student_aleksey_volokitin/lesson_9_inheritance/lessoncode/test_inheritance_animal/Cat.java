package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_animal;

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу!");
    }
}
