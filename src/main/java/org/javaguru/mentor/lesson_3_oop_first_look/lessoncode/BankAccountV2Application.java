package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

class BankAccountV2Application {

    public static void main(String[] args) {
        // create
        BankAccountV2 bankAccount1 = new BankAccountV2();

        BankAccountV2 bankAccount2 = new BankAccountV2("Vasja P", 10);

        BankAccountV2 bankAccount3 = new BankAccountV2("Vasja F", 0);

        BankAccountV2 bankAccount4 = new BankAccountV2("Lesha K", 10000);


        BankAccountV2 bankAccount5 = new BankAccountV2("XXX");
        BankAccountV2 bankAccount6 = new BankAccountV2("YYY");
        BankAccountV2 bankAccount7 = new BankAccountV2("ZZZ");

        BankAccountV2 bankAccount8 = new BankAccountV2(10);

        // use
        String owner7 = bankAccount7.getOwner();
        int money7 = bankAccount7.getMoney();
        System.out.println("Bank Account 7 owner = " + owner7);
        System.out.println("Bank Account 7 money = " + money7);


        // destroy


    }

}
