package org.javaguru.student_evgenii_pashtaev.lesson_8.homework.level_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IntegerListDemo {
    List<Integer> array = new ArrayList<>();

    public static void main(String[] args) {

        IntegerListDemo demo = new IntegerListDemo();
        demo.array.add(1);
        demo.array.add(2);
        demo.array.add(3);
        demo.array.add(4);
        demo.array.add(5);
        demo.array.add(6);
        System.out.println(demo.array);

        demo.array.addFirst(0);
        demo.array.addLast(7);
        System.out.println(demo.array);

        System.out.println(demo.array.size());

        demo.array.remove(0);
        System.out.println(demo.array);

        System.out.println(demo.array.isEmpty());

        Iterator<Integer> iterator = demo.array.iterator();

        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }


    }
}
