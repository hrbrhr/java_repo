package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.bankapi;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    // создайте конструктор класса, в котором вы получаете список ролей

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean contains(Role role) {
        return roles.contains(role);
    }
}
