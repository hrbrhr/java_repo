package org.javaguru.student_vitalii_lutsenko.lesson_3.classwork;

class BankAccountAPP {


    public static void main(String[]args) {

      //create
        BankAccount bankAccount1 = new BankAccount();

        BankAccount bankAccount2 = new BankAccount("Vasya P ", 10);

        BankAccount bankAccount3 = new BankAccount("Vasya H ", 9);

        BankAccount bankAccount4 = new BankAccount("Petya P ", 1001);

        BankAccount bankAccount5 = new BankAccount("Niger");

        BankAccount bankAccount6 = new BankAccount(234);

        BankAccount bankAccount7 = new BankAccount("Kolya");

        BankAccount bankAccount8 = new BankAccount("Hachik", 456);

        //use
        String owner7 = bankAccount7.getOwner();
        int money7 = bankAccount7.getMoney();
        System.out.println("Bank Account 7 owner = " + owner7);
        System.out.println("Bank Account 7 money = " + money7 + " EURO");

        String owner8 = bankAccount8.getOwner();
        int money8 = bankAccount8.getMoney();
         System.out.println("Bank Account 8 owner = " + owner8);
         System.out.println("Bank Account 8 money = " + money8 + " EURO");

         String owner6 = bankAccount6.getOwner();
         int money6 = bankAccount6.getMoney();
         System.out.println("Bank Account 6 owner = " + owner6);
         System.out.println("Bank Account 6 money = " + money6 + " EURO");


    }


}
