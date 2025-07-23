package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_5_middle;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest suite = new ColourWaveDetectorTest();
        suite.testViolet();
        suite.testBlue();
        suite.testGreen();
        suite.testYellow();
        suite.testOrange();
        suite.testRed();
        suite.testInvisible();
    }

    private void testViolet() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Violet";
        int wave = 380;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testBlue() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Blue";
        int wave = 494;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testGreen() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Green";
        int wave = 500;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testYellow() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Yellow";
        int wave = 589;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testOrange() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Orange";
        int wave = 619;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testRed() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Red";
        int wave = 620;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void testInvisible() {
        ColourWaveDetector detector = new ColourWaveDetector();
        String expected = "Invisible Light";
        int wave = 751;
        checkExpect(expected, detector.colourWave(wave), "should " + expected + " at " + wave);
    }

    private void checkExpect(String expected, String real, String testCaseName) {
        if (real.equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

}
