package org.javaguru.student_evgenii_pashtaev.lesson_8.homework.level_1;

import java.util.ArrayList;

public class Example {

    String name;

    public Example(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Misha");
        array.add("Petya");
        array.add("Masha");
        array.add("Olga");
        System.out.println(array);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        System.out.println(array2);

        Example ex1 = new Example("Example1");
        Example ex2 = new Example("Example2");
        Example ex3 = new Example("Example3");
        ArrayList<Example> array3 = new ArrayList<>();
        array3.add(ex1);
        array3.add(ex2);
        array3.add(ex3);
        System.out.println(array3.toString());

    }

    @Override
    public String toString() {
        return this.name;
    }
}
