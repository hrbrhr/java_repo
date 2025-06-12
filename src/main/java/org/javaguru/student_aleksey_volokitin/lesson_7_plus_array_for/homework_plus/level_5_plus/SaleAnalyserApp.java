package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_5_plus;

class SaleAnalyserApp {
    public static void main(String[] args) {
        Sale sales[] = {new Sale("Bread", 49.50, 124),
                        new Sale("Meat", 530.00, 16),
                        new Sale("Water", 32.00, 50),
                        new Sale("Milk", 125.00, 130),
                        new Sale("Fish", 750.00, 128)};
//        Sale sales[] = {};

        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String nameOfBestSellingProduct = saleAnalyser.findBestSellingProduct(sales);
        int amountOfBestSells = saleAnalyser.findAmountOfSales(sales, nameOfBestSellingProduct);
        System.out.println("Name of best selling product: " + nameOfBestSellingProduct +
                           ", amount of sells: " + amountOfBestSells);

        String nameProductWithMaxSumSelling = saleAnalyser.findProductWithMaxSumOfSales(sales);
        double maxSumOfSelling = saleAnalyser.findMaxSumOfSales(sales, nameOfBestSellingProduct);

        System.out.println("Name of product with max sum of selling: " + nameProductWithMaxSumSelling +
                ", max sum of selling: " + maxSumOfSelling);

    }
}
