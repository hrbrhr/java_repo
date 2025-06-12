package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_1_plus;

import java.util.ArrayList;
import java.util.List;

class ExampleApp {
    public static void main(String[] args) {
        // строки
        List<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.forEach(element -> System.out.println(element));


        // целые числа
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        ints.forEach(element -> System.out.println(element));
        int sum = 0;
        for (Integer intsElement: ints) {
            sum += intsElement;
        }
        System.out.println(sum);

        // вещественные числа
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.55);
        doubles.add(9.99);
        doubles.add(3.43);
        doubles.forEach(element -> System.out.println(element));
        System.out.println(doubles.size());

        // объекты
        Person person1 = new Person("Petr", "Ivanov", 30);
        Person person2 = new Person("Ivan", "Ivanov", 28);
        Person person3 = new Person("Dmitrij", "Shirokov", 25);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.forEach(element -> System.out.println(element.getFirstName() + " " +
                                                             element.getLastName()));

    }
}
