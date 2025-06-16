package org.javaguru.student_elena_tiutiunnikova.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class Task_1 {
//    Можно ли в список (java.util.List) положить 1 миллион объектов?
//    Напишите код программы, который демонстрирует ответ на этот вопрос.
//
//    PS: А 1 миллиард?

    public static void main(String[] args) {

        List<Integer> millionList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            millionList.add(i);
        }
        System.out.println("Size of million list: " + millionList.size());

        List<Integer> billionList = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            billionList.add(i);
        }
        System.out.println("Size of billion list: " + billionList.size());

    }

}
