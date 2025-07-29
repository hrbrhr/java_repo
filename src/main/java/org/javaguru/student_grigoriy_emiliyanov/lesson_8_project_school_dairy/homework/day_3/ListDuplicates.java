package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class ListDuplicates {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);
        integerList.add(1);
        integerList.add(5);
        // List can contain duplicates
        System.out.println(integerList);
    }
}
