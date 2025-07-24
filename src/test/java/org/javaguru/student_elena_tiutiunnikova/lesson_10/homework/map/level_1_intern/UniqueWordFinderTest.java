package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    @Test
    void testUniqueWords () {
        UniqueWordFinder finder = new UniqueWordFinder();

        String text = "This is test OF unique Words";
        Set<String> uniqueWords = finder.find(text);

        Set<String> expected = Set.of("this", "is", "test", "of", "unique", "words");

        assertEquals(expected, uniqueWords);
    }

    @Test
    void testEmptyText() {
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> result = finder.find("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullText() {
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> result = finder.find(null);
        assertTrue(result.isEmpty());
    }

}