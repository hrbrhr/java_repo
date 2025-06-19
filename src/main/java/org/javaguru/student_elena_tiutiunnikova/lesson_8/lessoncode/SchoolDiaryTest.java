package org.javaguru.student_elena_tiutiunnikova.lesson_8.lessoncode;

class SchoolDiaryTest {
    public static void main(String[] args) {
        SchoolDiaryTest test = new SchoolDiaryTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.testMin1();
        test.testMin2();
        test.testMin3();
        test.testMin4();
        test.testMin5();
        test.testAverage1();
        test.testAverage2();
        test.testAverage3();
        test.testAverage4();
        test.testAverageForTheSubject1();
        test.testAverageForTheSubject2();
        test.testAverageForTheSubject3();
        test.testAverageForTheSubject4();
        test.testAverageForTheSubject5();
    }

    // test case 1: subject = Math  mark = 5
    public void test1() {
      SchoolDiary dairy = new SchoolDiary();
      dairy.addMark("Math", 5);
      int result = dairy.findMaxMark("Math");
      if (result == 5) {
          System.out.println("OK");
      } else {
          System.out.println("FAIL");
      }
    }

// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 5
    public void test2() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        int result = dairy.findMaxMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

// test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
    public void test3() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 5);
        int result = dairy.findMaxMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

// test case 4: {} , "Math" = 0  (? null or 0 or error message)
    public void test4() {
        SchoolDiary dairy = new SchoolDiary();
        int result = dairy.findMaxMark("Math");
        if (result == 0) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

// test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5
    public void test5() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Eng", 10);
        int result = dairy.findMaxMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 1: subject = Math  mark = 5
    public void testMin1() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        int result = dairy.findMinMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 4
    public void testMin2() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        int result = dairy.findMinMark("Math");
        if (result == 4) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
    public void testMin3() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 5);
        int result = dairy.findMinMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 4: {} , "Math" = 0  (? null or 0 or error message)
    public void testMin4() {
        SchoolDiary dairy = new SchoolDiary();
        int result = dairy.findMinMark("Math");
        if (result == 0) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5
    public void testMin5() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Eng", 10);
        int result = dairy.findMinMark("Math");
        if (result == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    // test case 1: subject = Math  mark = 5 -> 5
    public void testAverage1() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        double result = dairy.findAverageMark();
        if ((Math.abs(result - 5.0)) < 0.001) {
            System.out.println("testAverage1 OK");
        } else {
            System.out.println("testAverage1 FAIL");
        }
    }
// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} -> "Math" = 4.5
    public void testAverage2() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        double result = dairy.findAverageMark();
        if ((Math.abs(result - 4.5)) < 0.001) {
            System.out.println("testAverage2 OK");
        } else {
            System.out.println("testAverage2 FAIL");
        }
    }

// test case 3: {} -> 0
    public void testAverage3() {
        SchoolDiary dairy = new SchoolDiary();

        double result = dairy.findAverageMark();
        if (result == 0) {
            System.out.println("testAverage3 OK");
        } else {
            System.out.println("testAverage3 FAIL");
        }
    }

// test case 4: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} -> "rez" = 6.333
    public void testAverage4() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        dairy.addMark("Eng", 10);
        double result = dairy.findAverageMark();
        if ((Math.abs(result - 6.333)) < 0.001) {
            System.out.println("testAverage4 OK");
        } else {
            System.out.println("testAverage4 FAIL");
        }
    }

// test case 1: subject = Math  mark = 5 -> 5.0
    public void testAverageForTheSubject1() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        double result = dairy.findAverageMarkForTheSubject("Math");
        if ((Math.abs(result - 5.0)) < 0.001) {
            System.out.println("testAverageForTheSubject1 OK");
        } else {
            System.out.println("testAverageForTheSubject1 FAIL");
        }
    }

// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} -> "rez" = 4.5
    public void testAverageForTheSubject2() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        double result = dairy.findAverageMarkForTheSubject("Math");
        if ((Math.abs(result - 4.5)) < 0.001) {
            System.out.println("testAverageForTheSubject2 OK");
        } else {
            System.out.println("testAverageForTheSubject2 FAIL");
        }
    }

// test case 3: {} -> 0
    public void testAverageForTheSubject3() {
        SchoolDiary dairy = new SchoolDiary();
        double result = dairy.findAverageMarkForTheSubject("Math");
        if ((Math.abs(result - 0)) < 0.001) {
            System.out.println("testAverageForTheSubject3 OK");
        } else {
            System.out.println("testAverageForTheSubject3 FAIL");
        }
    }

// test case 4: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} -> "rez" = 4.5
    public void testAverageForTheSubject4() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        dairy.addMark("Eng", 10);
        double result = dairy.findAverageMarkForTheSubject("Math");
        if ((Math.abs(result - 4.5)) < 0.001) {
            System.out.println("testAverageForTheSubject4 OK");
        } else {
            System.out.println("testAverageForTheSubject4 FAIL");
        }
    }

    // test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} Bio?-> "rez" = 0
    public void testAverageForTheSubject5() {
        SchoolDiary dairy = new SchoolDiary();
        dairy.addMark("Math", 5);
        dairy.addMark("Math", 4);
        dairy.addMark("Eng", 10);
        double result = dairy.findAverageMarkForTheSubject("Bio");
        if ((Math.abs(result - 0.0)) < 0.001) {
            System.out.println("testAverageForTheSubject5 OK");
        } else {
            System.out.println("testAverageForTheSubject5 FAIL");
        }
    }

}
