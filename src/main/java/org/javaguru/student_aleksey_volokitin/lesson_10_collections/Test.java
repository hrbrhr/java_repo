package org.javaguru.student_aleksey_volokitin.lesson_10_collections;

import java.util.List;

class Test {
    public static void main(String[] args) {
        final List<String> list = List.of("dog", "cat", "hamster");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .sorted()
                .forEach(x -> {
                    System.out.println("for each: " + x);
                });
    }
}
