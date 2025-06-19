package org.javaguru.student_artjoms_babicevs.lesson_6.level_5.task_1;

 class ColourWaveDetectorTest {

     public static void main(String[] args) {
         ColourWaveDetectorTest test = new ColourWaveDetectorTest();
         test.testViolet();
         test.testBlue();
         test.testGreen();
         test.testYellow();
         test.testOrange();
         test.testRed();
         test.testBelowVisibleRange();
         test.testAboveVisibleRange();
     }

     public void testViolet() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(400);
         checkResult(result, "Violet", "testViolet");
     }
     public void testBlue() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(470);
         checkResult(result, "Blue", "testBlue");
     }
     public void testGreen() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(500);
         checkResult(result, "Green", "testGreen");
     }
     public void testYellow() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(580);
         checkResult(result, "Yellow", "testYellow");
     }
     public void testOrange() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(600);
         checkResult(result, "Orange", "testOrange");
     }
     public void testRed() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(700);
         checkResult(result, "Red", "testRed");
     }
     public void testBelowVisibleRange() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(100);
         checkResult(result, "Invisible Light", "testBelowVisibleRange");
     }
     public void testAboveVisibleRange() {
         ColourWaveDetector detector = new ColourWaveDetector();
         String result = detector.colourWave(800);
         checkResult(result, "Invisible Light", "testAboveVisibleRange");
     }
     private void checkResult(String realResult, String expectedResult, String testName) {
         if (realResult.equals(expectedResult)) {
             System.out.println(testName + ": TEST OK!");
         } else {
             System.out.println(testName + ": TEST FAIL! expected = " + expectedResult + " but got = " + realResult);
         }
     }
 }





