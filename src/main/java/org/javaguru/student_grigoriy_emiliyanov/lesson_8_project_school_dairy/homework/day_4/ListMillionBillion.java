package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_4;

import java.util.ArrayList;
import java.util.List;

public class ListMillionBillion {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        // Add a million numbers : No error
        for (int i = 0; i < 1_000_000; i++) {
            integerList.add(i);
        }
        // Add a billion numbers : OutOfMemory: JAVA HEAP SPACE
        for (int i = 0; i < 1_000_000_000; i++) {
            integerList.add(i);
        }
    }
}
