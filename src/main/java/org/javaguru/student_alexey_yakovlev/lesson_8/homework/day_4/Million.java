package org.javaguru.student_alexey_yakovlev.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class Million {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        // миллион можно
        for (int i = 0; i < 1_000_001; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());


        // миллиард нельзя, падает с ошибкой
        for (int i = 0; i < 1_000_000_001; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
    }


}
