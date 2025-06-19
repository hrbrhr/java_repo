package org.javaguru.student_alexey_yakovlev.lesson_8.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class Duplicate {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(2);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
