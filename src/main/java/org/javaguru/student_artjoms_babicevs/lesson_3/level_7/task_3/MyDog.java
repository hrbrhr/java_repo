package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_3;

public class MyDog {
public static  void main(String[] args) {
    Dog myDog = new Dog("Bobik", 3);

    System.out.println(myDog.bark());
    System.out.println(myDog.getAge());

    myDog.haveBirthday();
    System.out.println(myDog.getAge());


}







}
