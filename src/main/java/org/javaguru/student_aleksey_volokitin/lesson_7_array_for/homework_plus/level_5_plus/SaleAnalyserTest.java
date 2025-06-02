package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_5_plus;

class SaleAnalyserTest {
    public static void main(String[] args) {
        SaleAnalyserTest saleAnalyserTest = new SaleAnalyserTest();

        saleAnalyserTest.test1FindBestSellingProductWhenZeroSales();
        saleAnalyserTest.test2FindBestSellingProduct();
        saleAnalyserTest.test3FindProductWithMaxSumOfSellingByZero();
        saleAnalyserTest.test4FindProductWithMaxSumOfSelling();
    }

    void test1FindBestSellingProductWhenZeroSales() {
        Sale sales[] = {};
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String expectedResult = "No products were selling";
        String testTitle = "Test 1: find best selling product when zero sales:";
        String realResult = saleAnalyser.findBestSellingProduct(sales);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2FindBestSellingProduct() {
        Sale sales[] = {new Sale("Bread", 49.50, 124),
                        new Sale("Meat", 530.00, 16),
                        new Sale("Water", 32.00, 50),
                        new Sale("Milk", 125.00, 130),
                        new Sale("Fish", 750.00, 128)};
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String expectedResult = "Milk";
        String testTitle = "Test 2: find best selling product when zero sales:";
        String realResult = saleAnalyser.findBestSellingProduct(sales);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3FindProductWithMaxSumOfSellingByZero() {
        Sale sales[] = {};
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String expectedResult = "No products were selling";
        String testTitle = "Test 3: find product with max sum of sales:";
        String realResult = saleAnalyser.findProductWithMaxSumOfSales(sales);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4FindProductWithMaxSumOfSelling() {
        Sale sales[] = {new Sale("Bread", 49.50, 124),
                        new Sale("Meat", 530.00, 16),
                        new Sale("Water", 32.00, 50),
                        new Sale("Milk", 125.00, 130),
                        new Sale("Fish", 750.00, 128)};
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String expectedResult = "Fish";
        String testTitle = "Test 4: find product with max sum of sales:";
        String realResult = saleAnalyser.findProductWithMaxSumOfSales(sales);
        checkResult(expectedResult, realResult, testTitle);
    }

    void checkResult(String expectedResult, String realResult, String testTitle) {
        if (expectedResult.equalsIgnoreCase(realResult)) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}
