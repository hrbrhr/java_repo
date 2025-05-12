package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_1_6_plus;

class BankAccountV2App {
    public static void main(String[] args) {

        BankAccountV2 bankAccount1 = new BankAccountV2();
        BankAccountV2 bankAccount2 = new BankAccountV2("Ivanov I.I");
        BankAccountV2 bankAccount3 = new BankAccountV2("Petrov P.P", 1000);

        System.out.println("Bank account 1:");
        System.out.println("Full name: " + bankAccount1.getOwner() +
                           ", money amount: "+ bankAccount1.getMoney());
        System.out.println("Bank account 2:");
        System.out.println("Full name: " + bankAccount2.getOwner() +
                ", money amount: "+ bankAccount2.getMoney());
        System.out.println("Bank account 3:");
        System.out.println("Full name: " + bankAccount3.getOwner() +
                ", money amount: "+ bankAccount3.getMoney());

        bankAccount1.setOwner("New bank account");
        bankAccount1.setMoney(2000);

        System.out.println("Bank account 1:");
        System.out.println("Full name: " + bankAccount1.getOwner() +
                ", money amount: "+ bankAccount1.getMoney());

    }
}
