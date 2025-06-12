package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_5_plus;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest colourWaveDetectorTest = new ColourWaveDetectorTest();
        colourWaveDetectorTest.test1Wave200();
        colourWaveDetectorTest.test2Wave379();
        colourWaveDetectorTest.test3Wave380();
        colourWaveDetectorTest.test4Wave420();
        colourWaveDetectorTest.test5Wave449();
        colourWaveDetectorTest.test6Wave450();
        colourWaveDetectorTest.test7Wave470();
        colourWaveDetectorTest.test8Wave494();
        colourWaveDetectorTest.test9Wave495();
        colourWaveDetectorTest.test10Wave530();
        colourWaveDetectorTest.test11Wave569();
        colourWaveDetectorTest.test12Wave570();
        colourWaveDetectorTest.test13Wave570();
        colourWaveDetectorTest.test14Wave589();
        colourWaveDetectorTest.test15Wave590();
        colourWaveDetectorTest.test16Wave610();
        colourWaveDetectorTest.test17Wave619();
        colourWaveDetectorTest.test18Wave620();
        colourWaveDetectorTest.test19Wave700();
        colourWaveDetectorTest.test20Wave750();
        colourWaveDetectorTest.test21Wave751();
        colourWaveDetectorTest.test22Wave999();
    }

    void test1Wave200() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 200;
        String expectedResult = "Invisible Light";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 1: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2Wave379() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 379;
        String expectedResult = "Invisible Light";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 2: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3Wave380() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 380;
        String expectedResult = "Violet";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 3: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4Wave420() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 420;
        String expectedResult = "Violet";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 4: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test5Wave449() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 449;
        String expectedResult = "Violet";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 5: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test6Wave450() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 450;
        String expectedResult = "Blue";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 6: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test7Wave470() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 470;
        String expectedResult = "Blue";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 7: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test8Wave494() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 494;
        String expectedResult = "Blue";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 8: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test9Wave495() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 495;
        String expectedResult = "Green";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 9: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test10Wave530() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 530;
        String expectedResult = "Green";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 10: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test11Wave569() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 569;
        String expectedResult = "Green";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 11: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test12Wave570() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 570;
        String expectedResult = "Yellow";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 12: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test13Wave570() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 580;
        String expectedResult = "Yellow";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 13: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test14Wave589() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 589;
        String expectedResult = "Yellow";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 14: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test15Wave590() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 590;
        String expectedResult = "Orange";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 15: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test16Wave610() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 610;
        String expectedResult = "Orange";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 16: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test17Wave619() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 619;
        String expectedResult = "Orange";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 17: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test18Wave620() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 620;
        String expectedResult = "Red";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 18: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test19Wave700() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 700;
        String expectedResult = "Red";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 19: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test20Wave750() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 750;
        String expectedResult = "Red";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 20: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test21Wave751() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 751;
        String expectedResult = "Invisible Light";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 21: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test22Wave999() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        int waveLength = 999;
        String expectedResult = "Invisible Light";
        String realResult = colourWaveDetector.colourWave(waveLength);
        String testTitle = "Test 22: wave length - " + waveLength + ", colour - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void checkResult(String expectedResult, String realResult, String testTitle) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}
