package org.javaguru.student_elena_tiutiunnikova.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
//    В классе IntegerListDemo создайте список целых чисел.
//    Продемонстрируйте как:
//           - добавить в список элемент (в начало и в конец)
//- узнать длину списка
//- удалить элемент из списка (по индексу и без)
//- узнать пустой список или нет
//- обойти список и вывести на консоль каждый элемент.

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Size of list: " + numbers.size());

        numbers.remove(0);
        numbers.remove(Integer.valueOf(2));

        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is full");
        };

        for (Integer number : numbers) {
            System.out.println(numbers);
        }

    }
}
