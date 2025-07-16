package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list_plus.homework_plus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Scrabble {
    List<String> scrabbleWords;

    public Scrabble(String typeOfList) {
        if(typeOfList.equals("ArrayList")) {
            this.scrabbleWords = new ArrayList<>();
        }
        if(typeOfList.equals("LinkedList")) {
            this.scrabbleWords = new LinkedList<>();
        }
    }

    public void fillingWords(int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            scrabbleWords.add(generateRandomWord());
        }
    }

    public void addWord(int index) {
        scrabbleWords.add(index, generateRandomWord());
    }

    public void removeAllWords() {
        while (scrabbleWords.size() > 0) {
            scrabbleWords.remove(0);
        }
    }

    public void removeWord(int index) {
        scrabbleWords.remove(index);
    }

    public void getAllWords() {
        for (int i = 0; i < scrabbleWords.size(); i++) {
            scrabbleWords.get(i);
        }
    }

    public String getWord(int index) {
        return scrabbleWords.get(index);
    }

    private String generateRandomWord () {
        Random random = new Random();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int countOfLetter = random.nextInt(8) + 2;
        String word = "";
        for (int j = 0; j < countOfLetter; j++) {
            int numberOfLetter = random.nextInt(letters.length());
            word = word + letters.substring(numberOfLetter, numberOfLetter + 1);
        }
        return  word;
    }
}
