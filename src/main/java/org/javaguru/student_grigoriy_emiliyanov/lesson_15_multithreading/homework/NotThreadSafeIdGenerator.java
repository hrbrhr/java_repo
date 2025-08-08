package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.homework;

class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }
}
