package org.javaguru.student_evgenii_pashtaev.lesson_8.homework.level_4;

import java.util.ArrayList;
import java.util.List;

public class Billion {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i <= 1000000; i++){
            array.add(i);
        }
        System.out.println(array);
    }
}
