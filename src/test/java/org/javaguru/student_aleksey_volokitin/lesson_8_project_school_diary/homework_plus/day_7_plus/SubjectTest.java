package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectTest {

    @Test
    void test1FindMaxMarkOfSubject() {

        Student student1 = new Student("Ivan", "Petrov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher1 = new Teacher("Elizaveta", "Pliaskina", "Math");
        Subject subject1 = new Subject("Math", teacher1);
        subjects.add(subject1);

        int expectedResult = 0;
        int actualResult = subject1.findMaxMarkOfSubject();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2FindMaxMarkOfSubject() {

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

        int expectedResult = 5;
        int actualResult = subject1.findMaxMarkOfSubject();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3FindMinMarkOfSubject() {
        Student student1 = new Student("Petr", "Ivanov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Subject subject2 = new Subject("Eng", teacher2);
        subject2.addMark("02.09.2025", 5);
        subject2.addMark("04.09.2025", 5);
        subject2.addMark("09.09.2025", 4);
        subject2.addMark("11.09.2025", 5);
        subject2.addMark("16.09.2025", 3);
        subject2.addMark("18.09.2025", 5);
        subjects.add(subject2);

        int expectedResult = 3;
        int actualResult = subject2.findMinMarkOfSubject();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test4FindMinMarkOfSubject() {
        Student student1 = new Student("Petr", "Ivanov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Subject subject2 = new Subject("Eng", teacher2);
        subjects.add(subject2);

        int expectedResult = 0;
        int actualResult = subject2.findMinMarkOfSubject();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test5FindAverageMarkOfSubject() {
        Student student3 = new Student("Dmitrij", "Shirokov", "5A");
        SchoolDiary schoolDiary = new SchoolDiary(student3);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher3 = new Teacher("Natalia", "Zabelina", "Inf");
        Subject subject3 = new Subject("Eng", teacher3);
        subject3.addMark("02.09.2025", 5);
        subject3.addMark("04.09.2025", 5);
        subject3.addMark("09.09.2025", 4);
        subject3.addMark("11.09.2025", 5);
        subject3.addMark("16.09.2025", 4);
        subject3.addMark("18.09.2025", 5);
        subjects.add(subject3);

        double expectedResult = 4.666666;
        double actualResult = subject3.findAverageMarkOfSubject();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test6FindAverageMarkOfSubject() {
        Student student3 = new Student("Dmitrij", "Shirokov", "5A");
        SchoolDiary schoolDiary = new SchoolDiary(student3);
        List<Subject> subjects = schoolDiary.getSubjects();
        Teacher teacher3 = new Teacher("Natalia", "Zabelina", "Inf");
        Subject subject3 = new Subject("Eng", teacher3);
        subjects.add(subject3);

        double expectedResult = 0.0;
        double actualResult = subject3.findAverageMarkOfSubject();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}