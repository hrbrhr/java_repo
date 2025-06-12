package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolDiaryTest {
    @Test
    void test1FindAverageMarkOfAllSubjects() {
        Student student1 = new Student("Ivan", "Petrov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher1 = new Teacher("Elizaveta", "Pliaskina", "Math");

        Subject subject1 = new Subject("Math", teacher1);
        subject1.addMark("01.09.2025", 5);
        subject1.addMark("03.09.2025", 4);
        subject1.addMark("05.09.2025", 5);
        subject1.addMark("08.09.2025", 5);
        subject1.addMark("10.09.2025", 4);
        subject1.addMark("12.09.2025", 5);
        subjects.add(subject1);

        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Subject subject2 = new Subject("Eng", teacher2);
        subject2.addMark("02.09.2025", 5);
        subject2.addMark("04.09.2025", 5);
        subject2.addMark("09.09.2025", 4);
        subject2.addMark("11.09.2025", 5);
        subject2.addMark("16.09.2025", 3);
        subject2.addMark("18.09.2025", 5);
        subjects.add(subject2);

        double expectedResult = 4.583333;
        double actualResult = schoolDiary.findAverageMarkOfAllSubjects();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test2FindAverageMarkOfAllSubjects() {
        Student student1 = new Student("Ivan", "Petrov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher1 = new Teacher("Elizaveta", "Pliaskina", "Math");

        Subject subject1 = new Subject("Math", teacher1);
        subjects.add(subject1);

        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Subject subject2 = new Subject("Eng", teacher2);
        subjects.add(subject2);

        double expectedResult = 0.0;
        double actualResult = schoolDiary.findAverageMarkOfAllSubjects();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}