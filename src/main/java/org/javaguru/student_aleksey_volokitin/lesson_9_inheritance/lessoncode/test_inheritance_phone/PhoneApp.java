package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_phone;

class PhoneApp {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new NormalPhone(1984);
        AbstractPhone videoPhone=new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466,firstPhone);
            // Вращайте ручку
            // Сообщите номер абонента, сэр
        System.out.println(" ");
        user.callAnotherUser(224466,phone);
            // Вызываю номер 224466
        System.out.println(" ");
        user.callAnotherUser(224466,videoPhone);
            // Подключаю видеоканал для абонента 224466
    }
}
