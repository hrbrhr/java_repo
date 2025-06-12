package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_5_middle.task_1;

class SalesAnalysis {

    public String findProductsTheBestSelling(Sale[] sales) {
        return isNullorEmpty(sales) ? null : findBestSellingProductByCountForNotNullSales(sales);
    }

    public String findBestSellingProductByCountForNotNullSales (Sale[] sales) {
        String bestASellingProduct = sales[0].getProduct();
        int salesCount = calculateSalesUnitCount(sales, bestASellingProduct);
        for (int i = 0; i < sales.length; i++) {
            if (calculateSalesUnitCount(sales, sales[i].getProduct()) > salesCount) {
                bestASellingProduct = sales[i].getProduct();
                salesCount = calculateSalesUnitCount(sales, bestASellingProduct);
            }
        }
        return bestASellingProduct;
    }

    private boolean isNullorEmpty(Sale[] sales) {
        return (sales == null) || (sales.length == 0);
    }

    private int calculateSalesUnitCount(Sale[] sales, String product) {
        int salesUnitCount = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (product.equals(sale.getProduct())) {
                salesUnitCount += sale.getUnitCount();
            }
        }
        return salesUnitCount;
    }

}
