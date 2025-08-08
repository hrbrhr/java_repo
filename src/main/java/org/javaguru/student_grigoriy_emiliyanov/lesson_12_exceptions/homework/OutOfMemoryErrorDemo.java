package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        try {
            for (int i = 0; i < 100_000_000; i++) {
                aList.add(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
