package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_7_plus.task_2_plus;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aleks", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}
