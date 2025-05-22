package org.javaguru.student_anastassija.lesson_3;

 class BankAccountApplication {

     public static void main(String[] args) {
         // 1.create object
         BankAccount bankAccount1 = new BankAccount();

         BankAccount bankAccount2 = new BankAccount("Vasja P", 10);

         BankAccount bankAccount3 = new BankAccount("Anna", 20);

         BankAccount bankAccount4 = new BankAccount("Ivan", 50);

         BankAccount bankAccount5 = new BankAccount("Ivan", 50);

         BankAccount bankAccount6 = new BankAccount(50);

         BankAccount bankAccount7 = new BankAccount("Vanja", 45);

         // 2.use object

         String owner7 = bankAccount7.getOwner();
         int money7 = bankAccount7.getMoney();
         System.out.println("Bank Account 7 owner " + owner7);
         System.out.println("Bank Account 7 owner " + money7);
         // 3.remove object




     }
}
