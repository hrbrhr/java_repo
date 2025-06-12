package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_5_middle;

class SaleAppTest {
    public static void main(String[] args) {
        SaleAppTest test = new SaleAppTest();
        test.testTheMostPopularProductByCount();
        test.testTheMostPopularProductByRevenue();
        test.testNullCount();
        test.testNullRevenue();
    }

    private void testForm (String realResult, String expectedResult, String nameOfTest) {
        if (realResult.equals(expectedResult)) {
            System.out.println(nameOfTest + " is OK");
        } else {
            System.out.println(nameOfTest + " is FAIL");
        }
    }

    private void testFormNull (String realResult, String expectedResult, String nameOfTest) {
        if (expectedResult == null ? realResult == null : expectedResult.equals(realResult)) {
            System.out.println(nameOfTest + " is OK");
        } else {
            System.out.println(nameOfTest + " is FAIL");
        }
    }

    public void testTheMostPopularProductByCount () {
        SaleApp saleApp = new SaleApp();
        Sale[] sales = {
                new Sale("Apple", 120, 3),
                new Sale("Orange", 250.99, 5),
                new Sale("Tomato", 300, 10),
                new Sale("Apple", 55.5, 15),
                new Sale("Limon", 195, 1),
        };
        String realResult = saleApp.findTheMostPopularProductByCount(sales);
        testForm(realResult,"Apple","Test The Most Popular Product Sale By Count");
    }
//1192.5 apple,  1254,95 orange, 3000 TOMATO, 195 limon

    public void testTheMostPopularProductByRevenue () {
        SaleApp saleApp = new SaleApp();
        Sale[] sales = {
                new Sale("Apple", 120, 3),
                new Sale("Orange", 250.99, 5),
                new Sale("Tomato", 300, 10),
                new Sale("Apple", 55.5, 15),
                new Sale("Limon", 195, 1),
        };
        String realResult = saleApp.findTheMostPopularProductByRevenue(sales);
        testForm(realResult,"Tomato","Test The Most Popular Product Sale By Revenue");
    }

    public void testZEROTheMostPopularProductByRevenue () {
        SaleApp saleApp = new SaleApp();
        Sale[] sales = {
                new Sale("Apple", 120, 3),
                new Sale("Orange", 250.99, 5),
                new Sale("Tomato", 300, 10),
                new Sale("Apple", 55.5, 15),
                new Sale("Limon", 195, 1),
        };
        String realResult = saleApp.findTheMostPopularProductByRevenue(sales);
        testForm(realResult,"Tomato","Test The Most Popular Product Sale By Revenue");
    }

    public void testNullCount () {
        SaleApp saleApp = new SaleApp();
        Sale[] sales = null;
        String realResult = saleApp.findTheMostPopularProductByCount(sales);
        testFormNull(realResult, null, "Test Null By Count");
    }

    public void testNullRevenue () {
        SaleApp saleApp = new SaleApp();
        Sale[] sales = null;
        String realResult = saleApp.findTheMostPopularProductByRevenue(sales);
        testFormNull(realResult, null, "Test Null By Revenue");
    }
}
