package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.day_1_plus;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3();
        String fullName = constructorV3.getFullName();
        int age = constructorV3.getAge();
        boolean male = constructorV3.isMale();
        Boolean female = constructorV3.getFemale();
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(male);
        System.out.println(female);

    }
}
