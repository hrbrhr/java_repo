package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class UniqueWordFinder {
    Set<String> find(String text) {
       String[] words = text.split(" ");
       return Arrays.stream(words).collect(Collectors.toSet());
    }
}
