package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_5_middle.task_1;

class SalesAnalysisTest {

    public static void main(String[] args) {
        SalesAnalysisTest salesAnalysisTest = new SalesAnalysisTest();
        salesAnalysisTest.testFindBestSellingProductWithNull();
        salesAnalysisTest.testFindBestSellingProductWithEmptySalesArray();
        salesAnalysisTest.testFindBestSellingProductWithMultipleSales();
        salesAnalysisTest.testFindBestSellingProductWithSingleSale();
    }

    void testFindBestSellingProductWithNull() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        String realResult = salesAnalysis.findProductsTheBestSelling(null);
        if (realResult == null) {
            System.out.println("testFindBestSellingProductWithNull: OK");
        } else {
            System.out.println("testFindBestSellingProductWithNull: FAIL");
        }
    }

    void testFindBestSellingProductWithEmptySalesArray() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        Sale[] sales = new Sale[0];
        String realResult = salesAnalysis.findProductsTheBestSelling(sales);
        if (realResult == null) {
            System.out.println("testFindBestSellingProductWithEmptySalesArray: OK");
        } else {
            System.out.println("testFindBestSellingProductWithEmptySalesArray: FAIL");
        }
    }

    void testFindBestSellingProductWithSingleSale() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        Sale[] sales = {new Sale("Product A", 10, 10)};
        String realResult = salesAnalysis.findProductsTheBestSelling(sales);
        if (realResult.equals("Product A")) {
            System.out.println("testFindBestSellingProductWithSingleSale: OK");
        } else {
            System.out.println("testFindBestSellingProductWithSingleSale: FAIL");
        }
    }

    void testFindBestSellingProductWithMultipleSales() {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        Sale[] sales = {
                new Sale("Product A", 10, 10),
                new Sale("Product B", 5, 5),
                new Sale("Product A", 20, 5),
                new Sale("Product C", 15, 5),
                new Sale("Product B", 8, 5),
        };
        String realResult = salesAnalysis.findProductsTheBestSelling(sales);
        if (realResult.equals("Product A")) {
            System.out.println("testFindBestSellingProductWithMultipleSales: OK");
        } else {
            System.out.println("testFindBestSellingProductWithMultipleSales: FAIL");
        }
    }

}
