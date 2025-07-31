package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.list.homework;

import java.util.ArrayList;
import java.util.List;

class ScrabbleArray {
    private List<String> usedWords = new ArrayList<>();

    public void add(String word) {
        usedWords.add(word);
    }

    public int size() {
        return usedWords.size();
    }

    public String get(int index) {
        return usedWords.get(index);
    }

    public void remove(int index) {
        usedWords.remove(index);
    }
}
