package org.javaguru.student_evgenii_pashtaev.lesson_3.level_7;

class Dog {

    String name;
    int age;

    Dog(String name, int age){

        this.name = name;
        this.age = age;
    }

    String dogSay (){
        return "My nickname is " + this.name;
    }

    void dogBithDay(){
        this.age += 1;
    }

    int dogSayAge(){
        return this.age;
    }
}
