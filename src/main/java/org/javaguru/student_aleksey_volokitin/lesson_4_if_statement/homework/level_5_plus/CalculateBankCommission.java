package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_5_plus;

import java.util.Scanner;

class CalculateBankCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        int amountMoney = scanner.nextInt();
        double commissionBank = 0.0;
        double roundingCommission = 0.0;
        if (amountMoney < 1000){
            commissionBank = amountMoney * 0.03;
            roundingCommission = (Math.ceil(commissionBank * 100)) / 100.0d;
            //System.out.println(commissionBank);
            //System.out.println(roundingCommission);
        }
        if ((amountMoney >= 1000) && (amountMoney < 5000)){
            commissionBank = amountMoney * 0.04;
            roundingCommission = (Math.ceil(commissionBank * 100)) / 100.0d;
            //System.out.println(commissionBank);
            //System.out.println(roundingCommission);
        }
        if (amountMoney >= 5000){
            commissionBank = amountMoney * 0.05;
            roundingCommission = (Math.ceil(commissionBank * 100)) / 100.0d;
            //System.out.println(commissionBank);
            //System.out.println(roundingCommission);
        }
        double issuedMoney = amountMoney * 1.0d - roundingCommission;
        System.out.println("Amount to be issued: " + issuedMoney +
                           ", commission of bank: " + roundingCommission);
        scanner.close();
    }
}
