package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_animal;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("Голос!");
    }

}
