package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.lessoncode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class WordFrequency {
    private final Map<String, Integer> words = new TreeMap<>();

    public static void main(String[] args) {
        WordFrequency wordFrequency = new WordFrequency();
        String text = "this is a sample text it contains several words this text is used for testing the word frequency counter";
        wordFrequency.process(text);
        wordFrequency.printFrequency();
    }

    private void printFrequency() {
        for (String key : words.keySet()) {
            System.out.println(key + " : " + words.get(key));
        }
    }

    private void process(String text) {
        String[] allWords = text.split(" ");
        System.out.println(Arrays.toString(allWords));
        for (String word : allWords) {
            int value = words.getOrDefault(word, 0) + 1;
            words.put(word, value);
        }
    }
}
