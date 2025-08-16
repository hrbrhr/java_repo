package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RandomNumberListNew {
    private final List<Integer> randomNumbers = Collections.synchronizedList(new ArrayList<>());

    public void add(int randomNumber) {
        randomNumbers.add(randomNumber);
    }

    public int size() {
        return randomNumbers.size();
    }
}
