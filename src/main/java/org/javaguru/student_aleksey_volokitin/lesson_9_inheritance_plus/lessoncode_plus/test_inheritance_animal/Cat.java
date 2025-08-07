package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance_plus.lessoncode_plus.test_inheritance_animal;

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу!");
    }
}
