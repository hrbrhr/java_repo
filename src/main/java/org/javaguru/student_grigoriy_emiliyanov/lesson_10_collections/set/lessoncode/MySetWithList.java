package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.set.lessoncode;

import java.util.ArrayList;
import java.util.List;

class MySetWithList<T> {
    private List<T> set = new ArrayList<>();

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

    List<T> getAll() {
        return set;
    }
}
