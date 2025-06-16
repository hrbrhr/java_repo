package org.javaguru.student_elena_tiutiunnikova.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class Task_1 {
//
//    Что может хранить java.util.List: примитивные типы данных
//    или ссылки на объекты, или то и другое?
//    Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        System.out.println("Список животных" + animals);
        System.out.println("Список цифр" + numbers);
    }



}
