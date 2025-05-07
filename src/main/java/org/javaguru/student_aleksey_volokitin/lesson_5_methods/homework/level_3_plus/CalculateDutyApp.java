package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework.level_3_plus;

class CalculateDutyApp {
    public static void main(String[] args) {
        Duty duty = new Duty();

        double amountProfit = 1000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 9999;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 10000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 20000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 49999;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 50000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));

        amountProfit = 60000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateDuty(amountProfit));
    }
}
