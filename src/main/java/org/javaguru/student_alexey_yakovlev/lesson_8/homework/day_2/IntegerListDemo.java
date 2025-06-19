package org.javaguru.student_alexey_yakovlev.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(0, 1);
        integers.add(5);
        System.out.println(integers.size());
        integers.remove(0);
        integers.remove(Integer.valueOf(5));
        System.out.println(integers.isEmpty());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
