package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_5_middle;

class SalesAnalyzerTest {
    public static void main(String[] args) {
        SalesAnalyzerTest suite = new SalesAnalyzerTest();
        suite.testFindByQtyWhenNull();
        suite.testFindByQtyWhenEmpty();
        suite.testFindByQtySingle();
        suite.testFindByQtyMany();
    }

    private void testFindByQtyWhenNull() {
        SalesAnalyzer analyzer = new SalesAnalyzer();
        Sale[] sales = null;
        String expected = "";
        checkExpect(expected, analyzer.bestSaleByQty(sales), "should find empty string when null sales reference");
    }

    private void testFindByQtyWhenEmpty() {
        SalesAnalyzer analyzer = new SalesAnalyzer();
        Sale[] sales = {};
        String expected = "";
        checkExpect(expected, analyzer.bestSaleByQty(sales), "should find empty string when null sales reference");
    }

    private void testFindByQtySingle() {
        SalesAnalyzer analyzer = new SalesAnalyzer();
        Sale[] sales = {
                new Sale("Product B", 8.0, 5)
        };
        String expected = "Product B";
        checkExpect(expected, analyzer.bestSaleByQty(sales), "should find same when single sale");
    }

    private void testFindByQtyMany() {
        SalesAnalyzer analyzer = new SalesAnalyzer();
        Sale[] sales = {
                new Sale("Product A", 10.0, 10),
                new Sale("Product B", 5.0, 5),
                new Sale("Product B", 50.0, 5),
                new Sale("Product A", 20.0, 5),
                new Sale("Product C", 15.0, 5),
                new Sale("Product B", 8.0, 5)
        };
        String expected = "Product A";
        checkExpect(expected, analyzer.bestSaleByQty(sales), "should find when many sales");
    }

    private void checkExpect(double expected, double real, String testCaseName) {
        double epsilon = 0.001;
        if (Math.abs(expected - real) < epsilon) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(String expected, String real, String testCaseName) {
        if (real.equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
