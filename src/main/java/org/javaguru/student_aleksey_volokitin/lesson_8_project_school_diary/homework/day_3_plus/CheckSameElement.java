package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_3_plus;

import java.util.ArrayList;
import java.util.List;

class CheckSameElement {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        boolean flag = false;

        for (int i = 0; i < integerList.size(); i++) {
            int elementI = integerList.get(i);
            for (int j = i + 1 ; j < integerList.size(); j++) {
                int elementJ = integerList.get(j);
                if(elementI == elementJ) {
                    System.out.println("Элементы " + elementI + " равны");
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("\n" + "Одинаковые элементы возможны!!" + "\n");
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("C");
        stringList.add("B");
        stringList.add("A");
        flag = false;

        for (int i = 0; i < stringList.size(); i++) {
            String elementI = stringList.get(i);
            for (int j = i + 1 ; j < stringList.size(); j++) {
                String elementJ = stringList.get(j);
                if(elementI.equals(elementJ)) {
                    System.out.println("Элементы " + elementI + " равны");
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("\n" + "Одинаковые элементы возможны!!");
        }
    }
}
