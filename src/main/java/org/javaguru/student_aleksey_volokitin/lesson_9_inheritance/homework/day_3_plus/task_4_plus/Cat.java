package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_4_plus;

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void getVoice() {
        System.out.println("Mur-mur");
    }
}
