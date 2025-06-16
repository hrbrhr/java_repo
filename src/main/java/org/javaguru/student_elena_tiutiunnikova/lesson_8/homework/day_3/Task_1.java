package org.javaguru.student_elena_tiutiunnikova.lesson_8.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class Task_1 {
//    Может ли список (java.util.List) хранить одинаковые
//    элементы (дубликаты)?
//    Напишите код программы, который демонстрирует ответ на этот вопрос.
    public static void main(String[] args) {

     List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");

        for(String animal : animals) {
            System.out.println("Демонстрация дубля: " + animal);
        }
    }
}
