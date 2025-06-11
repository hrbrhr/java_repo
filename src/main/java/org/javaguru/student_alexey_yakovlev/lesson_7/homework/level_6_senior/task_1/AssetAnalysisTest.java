package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_6_senior.task_1;

class AssetAnalysisTest {

    public static void main(String[] args) {
        AssetAnalysisTest assetAnalysisTest = new AssetAnalysisTest();
        assetAnalysisTest.testCalculateTotalAssetValue();
        assetAnalysisTest.shouldCalculateAverageReturnPercentage();
    }

    public void testCalculateTotalAssetValue() {
        Stock[] stocks = {
                new Stock("ABC", 10_000, 10),
                new Stock("XYZ", 10_000, 10)
        };
        AssetAnalysis assetAnalysis = new AssetAnalysis();
        double realResult = assetAnalysis.calculateTotalAssetValue(stocks);
        if ((realResult - 20000) < 0.0001) {
            System.out.println("testCalculateTotalAssetValue: OK");
        } else {
            System.out.println("testCalculateTotalAssetValue: FAIL");
        }
    }

    public void shouldCalculateAverageReturnPercentage() {
        Stock[] stocks = {
                new Stock("ABC", 10_000, 10),
                new Stock("XYZ", 5_000, 20)
        };
        AssetAnalysis assetAnalysis = new AssetAnalysis();
        double realResult = assetAnalysis.calculateAverageReturnPercentage(stocks);
        if (Math.abs(realResult - 13.3333) < 0.0001) {
            System.out.println("shouldCalculateAverageReturnPercentage: OK");
        } else {
            System.out.println("shouldCalculateAverageReturnPercentage: FAIL");
        }
    }
}
