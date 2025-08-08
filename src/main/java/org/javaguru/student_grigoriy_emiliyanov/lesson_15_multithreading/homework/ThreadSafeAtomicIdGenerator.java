package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.homework;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGenerator {
    private AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.getAndIncrement();
    }
}
