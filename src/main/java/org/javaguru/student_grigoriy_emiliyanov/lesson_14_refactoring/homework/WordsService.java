package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

class WordsService {

    public int countRepetitions(String[] words, String searchedWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(searchedWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}
