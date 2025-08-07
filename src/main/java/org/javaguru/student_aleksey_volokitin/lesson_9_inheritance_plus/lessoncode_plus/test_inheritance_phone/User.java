package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance_plus.lessoncode_plus.test_inheritance_phone;

// Полиморфизм - использование в коде абстактного типа AbstractPhone phone

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
        phone.call(number);
    }
}

