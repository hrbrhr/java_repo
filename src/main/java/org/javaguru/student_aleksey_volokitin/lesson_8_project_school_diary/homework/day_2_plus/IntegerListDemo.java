package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_2_plus;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        // добавление элементов в список
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(6);
        integerList.add(7);

        // вывод на консоль всех элементов списка
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // добавление элементов в начало списка
        integerList.add(0, 0);
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // добавление элементов в середину списка
        integerList.add(5, 5); // нумерация элементов с нуля
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // длина списка
        int lengthList = integerList.size();
        System.out.println("Amount of elements of list: " + lengthList);
        System.out.println(" ");

        // удаление последнего элемента списка
        integerList.removeLast();
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // удаление первого элемента списка
        integerList.removeFirst();
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // удаление элемента по индексу
        integerList.remove(4);
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        integerList.add(4, 5);

        // проверка, является ли список пустым

        boolean listIsEmpty =  integerList.isEmpty();
        System.out.println(listIsEmpty);
        System.out.println(" ");

        // обход списка и вывод всех элементов
        // v1 - цикл for
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println(" ");

        // v2 - цикл for each
        for (Integer integerListElement: integerList) {
            System.out.println(integerListElement);
        }
        System.out.println(" ");

        // v3 - через лямбда-выражение
        integerList.forEach(item -> System.out.println(item));
        System.out.println(" ");

        // v4 - через метод-ссылку
        integerList.forEach(System.out::println);
        System.out.println(" ");
    }
}
