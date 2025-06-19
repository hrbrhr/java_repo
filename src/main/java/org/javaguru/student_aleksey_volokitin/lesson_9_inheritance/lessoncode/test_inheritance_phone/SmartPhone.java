package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_phone;

// Наследование и добавление нового своего функционала в класс-потомок

class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }

}
