package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_14;

class FamilyApp {
    public static void main(String[] args) {
        Human family1Mother = new Human("Natalya", "Ivanova", 40);
        Human family1Father = new Human("Sergey ", "Ivanov ", 42);
        Human family1Child = new Human("Aleksey", "Ivanov ", 15);
        Family family1 = new Family(family1Mother, family1Father, family1Child);

        Human family2Mother = new Human("Tatyana ", "Petrova", 43);
        Human family2Father = new Human("Vladimir", "Petrov ", 44);
        Human family2Child = new Human("Nadezhda", "Petrova", 14);
        Family family2 = new Family(family2Mother, family2Father, family2Child);

        family1.printFamily();
        family2.printFamily();

        family2Child.birthday();
        family2.printFamily();
    }
}
