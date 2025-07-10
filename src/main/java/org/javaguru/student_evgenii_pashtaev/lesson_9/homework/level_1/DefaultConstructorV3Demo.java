package org.javaguru.student_evgenii_pashtaev.lesson_9.homework.level_1;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {

        DefaultConstructorV3 constructor = new DefaultConstructorV3();

        String fullname = constructor.getFullName();
        int age = constructor.getAge();
        boolean male = constructor.getMale();
        Boolean female = constructor.getFemale();

        System.out.println(fullname + '\n' +  age + '\n' + male + '\n' + female);

    }
}
