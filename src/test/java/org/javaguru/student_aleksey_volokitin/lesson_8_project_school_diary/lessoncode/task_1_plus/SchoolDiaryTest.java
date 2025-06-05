package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.lessoncode.task_1_plus;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolDiaryTest {
    private static final double  THRESHOLD = 0.000001;

    @Test
    // Test 1: find max mark of math
    void test1MaxMarkOfSubject() {
        List<Mark> marks = new ArrayList<>();
        SchoolDiary schoolDiary = new SchoolDiary();

        int expectedResult = 0;
        int realResult = schoolDiary.findMaxMarkOfSubject(marks, "Math");
        assertEquals(expectedResult, realResult);
    }

    @Test
    // Test 2: find max mark of math
    void test2MaxMarkOfSubject() {

        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Math", 7));
        marks.add(new Mark("Geo", 9));
        marks.add(new Mark("Eng", 8));
        marks.add(new Mark("Math", 9));
        marks.add(new Mark("Math", 5));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Geo", 10));

        SchoolDiary schoolDiary = new SchoolDiary();

        int expectedResult = 9;
        int realResult = schoolDiary.findMaxMarkOfSubject(marks, "Math");
        assertEquals(expectedResult, realResult);
    }

    @Test
    // Test 3: find min mark of eng
    void test3MinMarkOfSubject() {
        List<Mark> marks = new ArrayList<>();
        SchoolDiary schoolDiary = new SchoolDiary();

        int expectedResult = 0;
        int realResult = schoolDiary.findMinMarkOfSubject(marks, "Eng");
        assertEquals(expectedResult, realResult);
    }

    @Test
    // Test 4: find min mark of geo
    void test4MinMarkOfSubject() {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Math", 7));
        marks.add(new Mark("Geo", 9));
        marks.add(new Mark("Eng", 8));
        marks.add(new Mark("Math", 9));
        marks.add(new Mark("Math", 5));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Geo", 10));
        SchoolDiary schoolDiary = new SchoolDiary();

        int expectedResult = 9;
        int realResult = schoolDiary.findMinMarkOfSubject(marks,"Geo");
        assertEquals(expectedResult, realResult);
    }

    @Test
        // Test 5: find average mark of geo
    void test5AverageMarkOfSubject() {
        List<Mark> marks = new ArrayList<>();
        SchoolDiary schoolDiary = new SchoolDiary();

        double expectedResult = 0.0d;
        double realResult = schoolDiary.findAverageMarkOfSubject(marks,"Geo");
        assertEquals(expectedResult, realResult, THRESHOLD);

    }

    @Test
        // Test 6: find average mark of geo
    void test6AverageMarkOfSubject() {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Math", 7));
        marks.add(new Mark("Geo", 9));
        marks.add(new Mark("Eng", 8));
        marks.add(new Mark("Math", 9));
        marks.add(new Mark("Math", 5));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Geo", 10));
        marks.add(new Mark("Geo", 6));
        SchoolDiary schoolDiary = new SchoolDiary();

        double expectedResult = 8.333333d;
        double realResult = schoolDiary.findAverageMarkOfSubject(marks,"Geo");
        assertEquals(expectedResult, realResult, THRESHOLD);
    }

    @Test
        // Test 7: find average mark all subjects
    void test7AverageMarkOfAllSubject() {
        List<Mark> marks = new ArrayList<>();
        SchoolDiary schoolDiary = new SchoolDiary();

        double expectedResult = 0.0d;
        double realResult = schoolDiary.findAverageMarkOfAllSubject(marks);
        assertEquals(expectedResult, realResult, THRESHOLD);
    }

    @Test
        // Test 8: find average mark of all subjects
    void test8AverageMarkOfAllSubject() {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Math", 7));
        marks.add(new Mark("Geo", 9));
        marks.add(new Mark("Eng", 8));
        marks.add(new Mark("Math", 9));
        marks.add(new Mark("Math", 5));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Geo", 10));
        SchoolDiary schoolDiary = new SchoolDiary();

        double expectedResult = 7.571428;
        double realResult = schoolDiary.findAverageMarkOfAllSubject(marks);
        assertEquals(expectedResult, realResult, THRESHOLD);
    }
}