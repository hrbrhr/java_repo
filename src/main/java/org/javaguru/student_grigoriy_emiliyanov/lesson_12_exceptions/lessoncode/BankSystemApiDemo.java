package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.lessoncode;

public class BankSystemApiDemo {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        try {
            System.out.println(bankSystem.findClientById("1234", "abcd"));
            System.out.println(bankSystem.findClientById("123", "abcd"));
//            System.out.println(bankSystem.findClientById("1234", "abc"));
        } catch (NoSuchClientException e) {
            System.out.println("No such client caught");
            System.out.println(e.getMessage());
        } catch (WrongKeyException e) {
            System.out.println("Wrong key caught");
            System.out.println(e.getMessage());
        }
    }
}
