package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

import java.util.List;

class SchoolDiaryTest {
    public static void main(String[] args) {
        SchoolDiaryTest testSuite = new SchoolDiaryTest();
        testSuite.shouldHaveNoMarksWhenNoEntry();
        testSuite.shouldHaveMarksWhenAdded();
        testSuite.shouldFindMax0WhenEmpty();
        testSuite.shouldFindMax0WhenAddedButNoSubjectMatch();
        testSuite.shouldFindMaxWhenAddedSubjectMatch();
        testSuite.shouldFindMin0WhenEmpty();
        testSuite.shouldFindMin0WhenAddedButNoSubjectMatch();
        testSuite.shouldFindMinWhenAddedSubjectMatch();
        testSuite.shouldFindAverage0WhenEmpty();
        testSuite.shouldFindAverage0WhenAddedButNoSubjectMatch();
        testSuite.shouldFindAverageWhenAddedSubjectMatch();
        testSuite.shouldFindOverAllAverage0WhenEmpty();
        testSuite.shouldFindOverAllAverageWhenAdded();
    }


    public void shouldHaveNoMarksWhenNoEntry() {
        SchoolDiary schoolDiary = new SchoolDiary();
        List<Mark> expected = List.of();
        checkExpect(expected, schoolDiary.getAllMarks(), "No entry test");
    }

    public void shouldHaveMarksWhenAdded() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        List<Mark> expected = List.of(
                new Mark("Math", 10),
                new Mark("Eng", 5),
                new Mark("Eng", 6),
                new Mark("Math", 6)
        );
        checkExpect(expected, schoolDiary.getAllMarks(), "Many entry test");
    }

    private void shouldFindMax0WhenEmpty() {
        SchoolDiary schoolDiary = new SchoolDiary();
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findMax("Bio"), "Find max = 0 when empty test");
    }

    private void shouldFindMax0WhenAddedButNoSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findMax("Bio"), "Find max = 0 when added but no subject match test");
    }

    private void shouldFindMaxWhenAddedSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 6;
        checkExpect(expected, schoolDiary.findMax("Eng"), "Find max when added and subject match test");
    }

    private void shouldFindMin0WhenEmpty() {
        SchoolDiary schoolDiary = new SchoolDiary();
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findMin("Math"), "Find min = 0 when empty test");
    }

    private void shouldFindMin0WhenAddedButNoSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findMin("Bio"), "Find min = 0 when added but no subject match test");
    }

    private void shouldFindMinWhenAddedSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 5;
        checkExpect(expected, schoolDiary.findMin("Eng"), "Find min when added and subject match test");
    }

    private void shouldFindAverage0WhenEmpty() {
        SchoolDiary schoolDiary = new SchoolDiary();
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findAverageForSubject("Math"), "Find average = 0 when added but no subject match test");
    }

    private void shouldFindAverage0WhenAddedButNoSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findAverageForSubject("Bio"), "Find average = 0 when added but no subject match test");
    }

    private void shouldFindAverageWhenAddedSubjectMatch() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = 5.5;
        checkExpect(expected, schoolDiary.findAverageForSubject("Eng"), "Find average when added and subject match test");
    }

    private void shouldFindOverAllAverage0WhenEmpty() {
        SchoolDiary schoolDiary = new SchoolDiary();
        double expected = 0.0;
        checkExpect(expected, schoolDiary.findOverallAverage(), "Find overall average = 0 when empty test");
    }

    private void shouldFindOverAllAverageWhenAdded() {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark("Math", 10);
        schoolDiary.addMark("Eng", 5);
        schoolDiary.addMark("Eng", 6);
        schoolDiary.addMark("Math", 6);
        double expected = (10 + 5 + 6 + 6) / 4.0;
        checkExpect(expected, schoolDiary.findOverallAverage(), "Find overall average when added test");
    }

    private void checkExpect(double expected, double real, String testCaseName) {
        double epsilon = 0.001;
        if (Math.abs(expected - real) < epsilon) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(List<Mark> expected, List<Mark> real, String testCaseName) {
        if (real.size() != expected.size()) {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
        for (int i = 0; i < expected.size(); i++) {
            Mark expectedElement = expected.get(i);
            Mark realElement = real.get(i);
            if (!realElement.equals(expectedElement)) {
                System.out.println(testCaseName + ": TEST FAIL! expectedElement = " + expectedElement + " but realResultElement = " + realElement);
            }
        }
        System.out.println(testCaseName + ": TEST OK!");
    }
}
