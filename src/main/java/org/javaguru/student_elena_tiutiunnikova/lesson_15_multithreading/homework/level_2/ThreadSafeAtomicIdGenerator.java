package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_2;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGenerator {
    private AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.getAndIncrement();
    }
}
