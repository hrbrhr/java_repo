package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_5_middle.task_1;

class ColourWaveDetectorTest {

    public static void main(String[] args) {
        ColourWaveDetectorTest colourWaveDetectorTest = new ColourWaveDetectorTest();
        colourWaveDetectorTest.test1Violet();
        colourWaveDetectorTest.test2Blue();
        colourWaveDetectorTest.test3Green();
        colourWaveDetectorTest.test4Yellow();
        colourWaveDetectorTest.test5Orange();
        colourWaveDetectorTest.test6Red();
        colourWaveDetectorTest.test7InvisibleLight();
    }

    public void test1Violet() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(390);

        if (realResult.equals("Violet")) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2Blue() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(451);

        if (realResult.equals("Blue")) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3Green() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(500);

        if (realResult.equals("Green")) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4Yellow() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(580);

        if (realResult.equals("Yellow")) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    public void test5Orange() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(591);

        if (realResult.equals("Orange")) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }

    public void test6Red() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(700);

        if (realResult.equals("Red")) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }

    public void test7InvisibleLight() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(860);

        if (realResult.equals("Invisible Light")) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }
}
