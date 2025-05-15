package org.javaguru.student_elena_tiutiunnikova.lesson_3.lessoncode;

public class BankAccountApplication {

    public static void main(String[] args) {
        // create

        BankAccount bankAccount2 = new BankAccount("Elena",10);
        BankAccount bankAccount3 = new BankAccount("Kostya", 25 );


        //use
        String owner2 =  bankAccount2.getOwner();
        int money2 = bankAccount2.getMoney();
        System.out.println("Bank Account 2 owner = " + owner2);
        System.out.println("Bank Account 2 money = " + money2);

        //destroy



    }

}
