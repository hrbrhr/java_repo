package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_4_plus;

import java.util.ArrayList;
import java.util.List;

class ListByMillionStringElements {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        int count = 100000000;
        for (int i = 0; i < count; i++) {
            stringList.add(Integer.toString(i));
        }
        if(stringList.size() == count) {
            System.out.println("list by " + count + " elements is exist!" );
        } else {
            System.out.println("list by " + count + " elements is NOT exist!" );
        }
    // миллион элементов списка создать возможно, миллиард - нет!
    // (при стандартном размере памяти виртуальной машины
    }
}
