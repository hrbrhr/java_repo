package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_10;

class Trader {

    private String fullName;
    private String city;
    private String country;

    //Создайте конструктор для класса Trader, через который
    //можно установить начальные значения всем свойствам класса.
    public Trader (String fullName, String city,String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }
    //Создайте в классе Trader get методы для всех свойств класса.
    public String getFullName(){
        return fullName;
    }
    public String getCity() {
        return city;
    }
    public String getCountry(){
        return country;
    }

}
