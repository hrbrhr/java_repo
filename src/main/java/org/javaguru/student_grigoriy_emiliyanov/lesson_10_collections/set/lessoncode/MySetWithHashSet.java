package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.set.lessoncode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MySetWithHashSet<T> {
    private Set<T> set = new HashSet<>();

    boolean add(T element) {
        if (contains(element)) return false;
        set.add(element);
        return true;
    }

    int size() {
        return set.size();
    }

    boolean remove(T element) {
        if (!contains(element)) return false;
        set.remove(element);
        return true;
    }

    boolean contains(T element) {
        return set.contains(element);
    }

    Set<T> getAll() {
        return set;
    }
}
