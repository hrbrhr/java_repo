package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.lessoncode;

abstract class AbstractShape implements Shape {
    private final String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
