package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_5_plus;

class SaleAnalyser {
    String findBestSellingProduct(Sale sales[]){
        int amountOfSelling = Integer.MIN_VALUE;
        String nameOfBestSellingProduct = "No products were selling";
        for (Sale sale: sales) {
            if (sale.getUnitCount() > amountOfSelling) {
                amountOfSelling = sale.getUnitCount();
                nameOfBestSellingProduct = sale.getProduct();
            }
        }
        return nameOfBestSellingProduct;
    }

    int findAmountOfSales(Sale sales[], String nameOfBestSellingProduct) {
        int amountOfSelling = 0;
        for (Sale sale: sales) {
            if (sale.getProduct().equalsIgnoreCase(nameOfBestSellingProduct)) {
                amountOfSelling = sale.getUnitCount();
            }
        }
        return  amountOfSelling;
    }

    String findProductWithMaxSumOfSales(Sale sales[]){
        double maxSumOfSelling = Double.MIN_VALUE;
        String nameOfBestSellingProduct = "No products were selling";
        double sumOfSelling = 0.0d;
        for (Sale sale: sales) {
            sumOfSelling = 1.0d * sale.getPricePerUnit() * sale.getUnitCount();
            if (sumOfSelling > maxSumOfSelling) {
                maxSumOfSelling = sumOfSelling;
                nameOfBestSellingProduct = sale.getProduct();
            }
        }
        return nameOfBestSellingProduct;
    }

    double findMaxSumOfSales(Sale sales[], String nameProductWithMaxSumOfSelling) {
        double maxSumOfSelling = 0.0d;
        for (Sale sale: sales) {
            if (sale.getProduct().equalsIgnoreCase(nameProductWithMaxSumOfSelling)) {
                maxSumOfSelling = 1.0d * sale.getPricePerUnit() * sale.getUnitCount();
            }
        }
        return maxSumOfSelling;
    }

}
