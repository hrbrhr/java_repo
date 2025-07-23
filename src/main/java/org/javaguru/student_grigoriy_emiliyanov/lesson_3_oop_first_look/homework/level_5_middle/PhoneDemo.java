package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_5_middle;

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
