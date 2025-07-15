package org.javaguru.student_vitalii_lutsenko.project_3.task_3;

class Trader {

    private String fullName;
    private String city;

    //Создайте конструктор для класса Trader, через который
    //можно установить начальные значения всем свойствам класса.
    public Trader (String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }
    //Создайте в классе Trader get методы для всех свойств класса.
    public String getFullName(){
        return fullName;
    }
    public String getCity() {
        return city;
    }

}
