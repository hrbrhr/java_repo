package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_4_plus;

import java.util.ArrayList;
import java.util.List;

class ListByMillionIntegerElements {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int count = 100000000;
        for (int i = 0; i < count; i++) {
            integerList.add(i);
        }
        if(integerList.size() == count) {
            System.out.println("list by " + count + " elements is exist!" );
        } else {
            System.out.println("list by " + count + " elements is NOT exist!" );
        }
    // миллион элементов списка создать возможно, миллиард - нет!
    // (при стандартном размере памяти виртуальной машины
    }
}
