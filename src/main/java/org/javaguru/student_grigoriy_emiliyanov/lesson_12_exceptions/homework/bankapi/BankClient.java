package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.bankapi;

class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    // создайте конструктор класса, в котором вы получите значения указанных свойств

    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // создайте get() методы для каждого из свойств

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
