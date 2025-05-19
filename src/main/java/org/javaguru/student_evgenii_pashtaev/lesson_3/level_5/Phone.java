package org.javaguru.student_evgenii_pashtaev.lesson_3.level_5;
/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Phone.
*/
class Phone {

    private String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
