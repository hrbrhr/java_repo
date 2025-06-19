package org.javaguru.student_alexey_yakovlev.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class Task_1 {

    public static void main(String[] args) {
        List<Object> examples = new ArrayList<>();

        examples.add("Example");
        examples.add(5);

        for (Object object : examples) {
            System.out.println(object);
        }
    }
}
