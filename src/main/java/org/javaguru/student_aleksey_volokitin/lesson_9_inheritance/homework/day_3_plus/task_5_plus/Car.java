package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_5_plus;

abstract class Car {
    private String model;

    Car(String model) {
        this.model = model;
    }

    abstract void accelerate();

    public String getModel() {
        return model;
    }
}
