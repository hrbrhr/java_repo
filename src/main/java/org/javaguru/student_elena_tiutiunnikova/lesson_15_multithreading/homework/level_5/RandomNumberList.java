package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_5;

import java.util.ArrayList;
import java.util.List;

class RandomNumberList {
    private List<Integer> randomNumbers = new ArrayList<>();

    public void add(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public int size() {
        return this.randomNumbers.size();
    }
}
