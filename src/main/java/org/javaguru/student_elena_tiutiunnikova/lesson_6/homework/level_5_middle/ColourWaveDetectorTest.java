package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_5_middle;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.testInvisible1();
        test.testInvisible2();
        test.testViolet1();
        test.testViolet2();
        test.testBlue();
        test.testGreen();
        test.testOrange();
        test.testRed();
        test.testYellow();
    }

    //20 -> Invisible Light
    public void testInvisible1 () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(20);

        if (realResult.equals("Invisible Light")) {
            System.out.println("Test Invisible 1 = OK");
        } else {
            System.out.println("Test Invisible 1 = FAIL");
        }
    }

    //751 -> Invisible Light
    public void testInvisible2 () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(751);

        if (realResult.equals("Invisible Light")) {
            System.out.println("Test Invisible 2 = OK");
        } else {
            System.out.println("Test Invisible 2 = FAIL");
        }
    }

    //380 -> Violet
    public void testViolet1 () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(380);

        if (realResult.equals("Violet")) {
            System.out.println("Test Violet 1 = OK");
        } else {
            System.out.println("Test Violet 1 = FAIL");
        }
    }

    //449 -> Violet
    public void testViolet2 () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(449);

        if (realResult.equals("Violet")) {
            System.out.println("Test Violet 2 = OK");
        } else {
            System.out.println("Test Violet 2 = FAIL");
        }
    }

    //481 -> Blue
    public void testBlue () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(481);

        if (realResult.equals("Blue")) {
            System.out.println("Test Blue = OK");
        } else {
            System.out.println("Test Blue = FAIL");
        }
    }

    //502 -> Green
    public void testGreen () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(502);

        if (realResult.equals("Green")) {
            System.out.println("Test Green = OK");
        } else {
            System.out.println("Test Green = FAIL");
        }
    }

    //574 -> Yellow
    public void testYellow () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(574);

        if (realResult.equals("Yellow")) {
            System.out.println("Test Yellow = OK");
        } else {
            System.out.println("Test Yellow = FAIL");
        }
    }

    //605 -> Orange
    public void testOrange () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(605);

        if (realResult.equals("Orange")) {
            System.out.println("Test Orange = OK");
        } else {
            System.out.println("Test Orange = FAIL");
        }
    }

    //724 -> Red
    public void testRed () {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(724);

        if (realResult.equals("Red")) {
            System.out.println("Test Red = OK");
        } else {
            System.out.println("Test Red = FAIL");
        }
    }
}
