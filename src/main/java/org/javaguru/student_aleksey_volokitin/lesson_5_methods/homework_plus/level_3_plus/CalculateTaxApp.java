package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_3_plus;

class CalculateTaxApp {
    public static void main(String[] args) {
        Tax duty = new Tax();

        double amountProfit = 1000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 9999;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 10000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 20000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 49999;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 50000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));

        amountProfit = 60000;
        System.out.println("Profit: " + amountProfit + ", amount of duty: " + duty.calculateTax(amountProfit));
    }
}
