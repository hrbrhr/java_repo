package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_phone;

// Инкапсуляция, метод openConnection приватный, его реализация не видна извне и недоступна к изменению

class SomePhone {

    private int year;
    private String company;
    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        //findComutator
        //openNewConnection...
    }
    public void call() {
        openConnection();
        System.out.println("Вызываю номер");
    }

    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

}
