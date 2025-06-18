package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_phone;

class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outputNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outputNumber );
    }
    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}
