package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_14;

class Human {
    private String firstName;
    private String lastName;
    private int age;

    Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    String getFirstName() { return firstName; }
    String getLastName()  { return lastName; }
    int getAge()          { return age; }

    void setFirstName(String newFirstName) { this.firstName = newFirstName; }
    void setLastName(String newLastName)   { this.lastName = newLastName; }
    void setAge(int newAge)                { this.age = newAge; }
    void birthday()                        { this.age += 1; }
}
