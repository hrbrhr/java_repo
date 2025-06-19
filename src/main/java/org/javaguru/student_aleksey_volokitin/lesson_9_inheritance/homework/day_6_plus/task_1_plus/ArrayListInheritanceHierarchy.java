package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_6_plus.task_1_plus;

// Иерархия наследования для класса java.util.ArrayList

import java.util.ArrayList;
import java.util.List;

class ArrayListInheritanceHierarchy {
    List<Mark> marks = new ArrayList<>();
    /*
        В Java класс java.util.ArrayList является частью иерархии наследования,
    которая выглядит следующим образом:

    java.lang.Object
        ↳ java.util.AbstractCollection<E>
            ↳ java.util.AbstractList<E>
                ↳ java.util.ArrayList<E>

    Подробное описание:

    1. java.lang.Object - Базовый класс для всех классов в Java.
        ArrayList косвенно наследует все методы Object (например, toString(), equals(), hashCode()).

    2. java.util.AbstractCollection<E> - Абстрактный класс, предоставляющий базовую реализацию интерфейса Collection.
        Реализует общие методы, такие как isEmpty(), contains(), toArray(), remove(), clear() и др.

    3. java.util.AbstractList<E> - Абстрактный класс, расширяющий AbstractCollection и реализующий интерфейс List.
        Предоставляет базовую реализацию списка на основе индексов (get(), set(), add(), remove()).
        Включает реализацию итератора (iterator(), listIterator()).

    4. java.util.ArrayList<E>
        Конкретная реализация динамического массива (списка с изменяемым размером).
        Добавляет оптимизированные методы для работы с массивом (ensureCapacity(), trimToSize()).
        Реализует интерфейсы:
            - List<E>
            - Iterable<E>
            - Collection<E>
            - RandomAccess (маркерный интерфейс, указывающий на быстрый доступ по индексу)
            - Cloneable
            - java.io.Serializable

    Реализуемые интерфейсы ArrayList:
        - public class ArrayList<E>
        - extends AbstractList<E>
        - implements List<E>, RandomAccess, Cloneable, Serializable
    */
}
