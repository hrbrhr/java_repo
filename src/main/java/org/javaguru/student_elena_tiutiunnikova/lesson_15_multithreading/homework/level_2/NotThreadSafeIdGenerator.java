package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_2;

//Ваша задача (если вы за неё возьметесь) написать программу,
//        которая докажет, что этот генератор id не потоко безопасный.

class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }

}
