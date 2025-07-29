package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

public static void main(String[] args) {
//    В классе IntegerListDemo создайте список целых чисел.
    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    integerList.add(4);
    integerList.add(5);
    System.out.println(integerList);
//- добавить в список элемент (в начало и в конец)
    integerList.addFirst(0);
    integerList.addLast(6);
    System.out.println(integerList);
//- узнать длину списка
    System.out.println("List size: " + integerList.size());
//- удалить элемент из списка (по индексу и без)
    integerList.remove(3);
    System.out.println(integerList);
    integerList.remove(Integer.valueOf(1));
    System.out.println(integerList);
//- узнать пустой список или нет
    System.out.println("Is empty: " + integerList.isEmpty());
//- обойти список и вывести на консоль каждый элемент.
    System.out.println(integerList);
    System.out.println("foreach loop");
    for (int i : integerList) {
        System.out.print(i);
        System.out.print(" ");
    }
    System.out.println();
    System.out.println("for i loop");
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i));
        System.out.print(" ");
    }
}
}
