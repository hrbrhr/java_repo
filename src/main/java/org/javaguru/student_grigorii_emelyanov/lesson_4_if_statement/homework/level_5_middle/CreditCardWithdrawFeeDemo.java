package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.homework.level_5_middle;

import java.util.Scanner;

//Расчёт комиссии за использование кредитной карты.
//
//        Банк взимает комиссию за снятие наличных с кредитной карты.
//
//        Если сумма снятия меньше 1000 евро, комиссия составляет 3% от суммы.
//
//        Если сумма от 1000 до 5000 евро, комиссия 4%.
//
//        Если сумма 5000 евро и больше, комиссия 5%.
//
//        Программа должна принимать сумму снятия и выводить сумму комиссии.
public class CreditCardWithdrawFeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum to withdraw:");
        int sum = scanner.nextInt();
        double cashFeeRatio = 0.0;
        if (sum < 1000) {
            cashFeeRatio = 0.03;
        } else if (sum < 5000) {
            cashFeeRatio = 0.04;
        } else {
            cashFeeRatio = 0.05;
        }
        double cashFee = sum * cashFeeRatio ;
        System.out.println("Your cash fee is: " + cashFee);
    }
}
