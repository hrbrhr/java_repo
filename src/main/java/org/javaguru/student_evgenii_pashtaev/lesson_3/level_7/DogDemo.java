package org.javaguru.student_evgenii_pashtaev.lesson_3.level_7;

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Shuchka", 2);

        String name = dog.dogSay();
        System.out.println(name);

        dog.dogBithDay();
        int age = dog.dogSayAge();
        System.out.println(age);

    }
}
