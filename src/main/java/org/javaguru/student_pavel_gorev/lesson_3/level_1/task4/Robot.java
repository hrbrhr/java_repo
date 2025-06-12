package org.javaguru.student_pavel_gorev.lesson_3.level_1.task4;

class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String get() {
        return name;
    }

    public void set(String newName) {
        this.name = newName;
    }
}
