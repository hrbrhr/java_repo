package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();

        if (text == null || text.isBlank()) {
            return uniqueWords;
        }

        String[] words = text.toLowerCase().split("[^a-zA-Zа-яА-Я0-9]+"); // разбивка по не-буквам/цифрам

        for (String word : words) {
            if (!word.isBlank()) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords;
    }

}
