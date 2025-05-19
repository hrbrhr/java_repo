package org.javaguru.student_evgenii_pashtaev.lesson_4.level_5;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        int money;
        Scanner input = new Scanner(System.in);
        money = input.nextInt();
        double fee = 0 ;

        if (money < 1000){
            fee = money * 0.03;
        }
        if (money >= 1000 && money < 5000){
            fee = money * 0.04;
        }
        if (money >= 5000){
            fee = money * 0.05;
        }
        System.out.println("Commission: " + fee);
    }
}
