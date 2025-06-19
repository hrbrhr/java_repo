package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_6_plus.task_2_plus;

/*
    В Java varargs (сокращение от variable-length arguments) — это механизм, который позволяет
методу принимать переменное количество аргументов одного типа.

    Основные особенности:
        - Синтаксис: Используется троеточие (...) после типа параметра.
        - Внутри метода varargs обрабатывается как массив.
        - Может быть только один varargs в списке параметров метода.
        - Должен быть последним в списке параметров.

    Ограничения:
        - Только один varargs в методе:
            Ошибка! Нельзя два varargs:
            void method(String... a, int... b) { ... }
        - Varargs должен быть последним:
            Ошибка! 'String...' не в конце:
            void method(int... a, String b) { ... }
        - Неоднозначность при перегрузке:
            void method(String... strs) { }
            void method(String a, String b) { }
            method("A", "B"); // Вызовет второй метод, а не varargs!

    Когда использовать?
        - Когда количество аргументов заранее неизвестно (например, String.format(), Logger.log()).
        - Для удобства, чтобы избежать создания массива вручную.
*/

class VarargsExample {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3 ,4 ,5));

        printInfo("Fruits", "Apple", "Orange", "Lemon");
    }

    public static int sum(int... numbers) {
        int totalSum = 0;
        for (int number: numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public static void printInfo(String title, String... items) {
        System.out.println("Title: " + title);
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
