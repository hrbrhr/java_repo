package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_7_senior;

class Dog {
   private String name;
   private int age;

   Dog (String name, int age) {
       this.name = name;
       this.age = age;
   }

    public String voice () {
       return "My nickname is " + this.name;
   }

       public int getBD() {
        return this.age + 1;
    }

    public int getAge() {
        return this.age;
    }


}
