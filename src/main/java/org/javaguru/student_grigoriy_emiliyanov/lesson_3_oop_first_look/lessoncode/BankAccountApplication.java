package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Petia", 1);
        BankAccount bankAccount2 = new BankAccount("Nikolay", 2);

        BankAccount bankAccount3 = new BankAccount("Vasia");
        BankAccount bankAccount4 = new BankAccount("Nika");

        BankAccount bankAccount5 = new BankAccount(100);

        System.out.println("Bank account 1:");
        System.out.println("Owner: " + bankAccount1.getOwner());
        System.out.println("Money amount: " + bankAccount1.getMoneyAmount());

        bankAccount1.setOwner("Petr");
        bankAccount1.setMoneyAmount(123);
        System.out.println("Bank account 1:");
        System.out.println("Owner: " + bankAccount1.getOwner());
        System.out.println("Money amount: " + bankAccount1.getMoneyAmount());
    }
}
