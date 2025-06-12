package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolJournalTest {
    @Test
    void test1FindMaxMarkOfSubjectInClass() {
        SchoolJournal schoolJournal =  initialValues();

        int expectedResult = 5;
        int actualResult = schoolJournal.findMaxMarkOfSubjectInClass("Math");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2FindMaxMarkOfSubjectInClass() {
        SchoolJournal schoolJournal = initialZeroValues();

        int expectedResult = 0;
        int actualResult = schoolJournal.findMaxMarkOfSubjectInClass("Math");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3FindMinMarkOfSubjectInClass() {
        SchoolJournal schoolJournal = initialValues();

        int expectedResult = 2;
        int actualResult = schoolJournal.findMinMarkOfSubjectInClass("Geo");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test4FindMinMarkOfSubjectInClass() {
        SchoolJournal schoolJournal = initialZeroValues();

        int expectedResult = 0;
        int actualResult = schoolJournal.findMinMarkOfSubjectInClass("Math");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test5FindAverageMarkOfSubjectInClass() {
        SchoolJournal schoolJournal = initialValues();

        double expectedResult = 4.277777;
        double actualResult = schoolJournal.findAverageMarkOfSubjectInClass("Math");
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test6FindAverageMarkOfSubjectInClass() {
        SchoolJournal schoolJournal = initialZeroValues();

        double expectedResult = 0.0;
        double actualResult = schoolJournal.findAverageMarkOfSubjectInClass("Eng");
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test7FindMaxMarkInClass() {
        SchoolJournal schoolJournal =  initialValues();

        int expectedResult = 5;
        int actualResult = schoolJournal.findMaxMarkInClass();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test8FindMaxMarkInClass() {
        SchoolJournal schoolJournal =  initialZeroValues();

        int expectedResult = 0;
        int actualResult = schoolJournal.findMaxMarkInClass();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test9FindMinMarkInClass() {
        SchoolJournal schoolJournal =  initialValues();

        int expectedResult = 1;
        int actualResult = schoolJournal.findMinMarkInClass();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test10FindMinMarkInClass() {
        SchoolJournal schoolJournal =  initialZeroValues();

        int expectedResult = 0;
        int actualResult = schoolJournal.findMinMarkInClass();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test11FindAverageMarkInClass() {
        SchoolJournal schoolJournal =  initialValues();

        double expectedResult = 4.481481;
        double actualResult = schoolJournal.findAverageMarkInClass();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test12FindAverageMarkInClass() {
        SchoolJournal schoolJournal =  initialZeroValues();

        double expectedResult = 0.0;
        double actualResult = schoolJournal.findAverageMarkInClass();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    SchoolJournal initialValues() {
        SchoolJournal schoolJournal = new SchoolJournal("5B", new Teacher("Elizaveta",
                                                                                      "Pliaskina",
                                                                                    "Math"));
        Student student1 = new Student("Ivan", "Ivanov", schoolJournal.getNameOfClass());
        Student student2 = new Student("Petr", "Petrov", schoolJournal.getNameOfClass());
        Student student3 = new Student("Dmitrij", "Dmitriev", schoolJournal.getNameOfClass());

        Teacher teacher1 = new Teacher("Elizaveta", "Pliaskina", "Math");
        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Teacher teacher3 = new Teacher("Irina", "Victorova", "Geo");

        SchoolDiary schoolDiary1 = new SchoolDiary(student1);
            Subject subject1SchoolDiary1 = new Subject("Math", teacher1);
                subject1SchoolDiary1.addMark("01.09.2025", 5);
                subject1SchoolDiary1.addMark("03.09.2025", 4);
                subject1SchoolDiary1.addMark("05.09.2025", 5);
                subject1SchoolDiary1.addMark("08.09.2025", 5);
                subject1SchoolDiary1.addMark("10.09.2025", 4);
                subject1SchoolDiary1.addMark("12.09.2025", 5);
            schoolDiary1.addSubjects(subject1SchoolDiary1);
            Subject subject2SchoolDiary1 = new Subject("Eng", teacher2);
                subject2SchoolDiary1.addMark("02.09.2025", 5);
                subject2SchoolDiary1.addMark("04.09.2025", 5);
                subject2SchoolDiary1.addMark("09.09.2025", 4);
                subject2SchoolDiary1.addMark("11.09.2025", 5);
                subject2SchoolDiary1.addMark("16.09.2025", 5);
                subject2SchoolDiary1.addMark("18.09.2025", 5);
            schoolDiary1.addSubjects(subject2SchoolDiary1);
            Subject subject3SchoolDiary1 = new Subject("Geo", teacher3);
                subject3SchoolDiary1.addMark("03.09.2025", 5);
                subject3SchoolDiary1.addMark("10.09.2025", 5);
                subject3SchoolDiary1.addMark("17.09.2025", 4);
                subject3SchoolDiary1.addMark("24.09.2025", 5);
            schoolDiary1.addSubjects(subject3SchoolDiary1);
        schoolJournal.addSchoolDairy(schoolDiary1);

        SchoolDiary schoolDiary2 = new SchoolDiary(student2);
            Subject subject1SchoolDiary2 = new Subject("Math", teacher1);
                subject1SchoolDiary2.addMark("01.09.2025", 4);
                subject1SchoolDiary2.addMark("03.09.2025", 3);
                subject1SchoolDiary2.addMark("05.09.2025", 5);
                subject1SchoolDiary2.addMark("08.09.2025", 4);
                subject1SchoolDiary2.addMark("10.09.2025", 4);
                subject1SchoolDiary2.addMark("12.09.2025", 5);
            schoolDiary2.addSubjects(subject1SchoolDiary2);
            Subject subject2SchoolDiary2 = new Subject("Eng", teacher2);
                subject2SchoolDiary2.addMark("02.09.2025", 5);
                subject2SchoolDiary2.addMark("04.09.2025", 4);
                subject2SchoolDiary2.addMark("09.09.2025", 4);
                subject2SchoolDiary2.addMark("11.09.2025", 3);
                subject2SchoolDiary2.addMark("16.09.2025", 5);
                subject2SchoolDiary2.addMark("18.09.2025", 5);
            schoolDiary2.addSubjects(subject2SchoolDiary2);
            Subject subject3SchoolDiary2 = new Subject("Geo", teacher3);
                subject3SchoolDiary2.addMark("03.09.2025", 5);
                subject3SchoolDiary2.addMark("10.09.2025", 4);
                subject3SchoolDiary2.addMark("17.09.2025", 5);
                subject3SchoolDiary2.addMark("24.09.2025", 5);
            schoolDiary2.addSubjects(subject3SchoolDiary2);
        schoolJournal.addSchoolDairy(schoolDiary2);

        SchoolDiary schoolDiary3 = new SchoolDiary(student3);
            Subject subject1SchoolDiary3 = new Subject("Math", teacher1);
                subject1SchoolDiary3.addMark("01.09.2025", 5);
                subject1SchoolDiary3.addMark("03.09.2025", 1);
                subject1SchoolDiary3.addMark("05.09.2025", 5);
                subject1SchoolDiary3.addMark("08.09.2025", 5);
                subject1SchoolDiary3.addMark("10.09.2025", 4);
                subject1SchoolDiary3.addMark("12.09.2025", 4);
            schoolDiary3.addSubjects(subject1SchoolDiary3);
            Subject subject2SchoolDiary3 = new Subject("Eng", teacher2);
                subject2SchoolDiary3.addMark("02.09.2025", 5);
                subject2SchoolDiary3.addMark("04.09.2025", 5);
                subject2SchoolDiary3.addMark("09.09.2025", 4);
                subject2SchoolDiary3.addMark("11.09.2025", 5);
                subject2SchoolDiary3.addMark("16.09.2025", 5);
                subject2SchoolDiary3.addMark("18.09.2025", 5);
            schoolDiary3.addSubjects(subject2SchoolDiary3);
            Subject subject3SchoolDiary3 = new Subject("Geo", teacher3);
                subject3SchoolDiary3.addMark("03.09.2025", 5);
                subject3SchoolDiary3.addMark("10.09.2025", 2);
                subject3SchoolDiary3.addMark("17.09.2025", 4);
                subject3SchoolDiary3.addMark("24.09.2025", 5);
            schoolDiary3.addSubjects(subject3SchoolDiary3);
        schoolJournal.addSchoolDairy(schoolDiary3);
    return schoolJournal;
    }


    SchoolJournal initialZeroValues() {
        SchoolJournal schoolJournal = new SchoolJournal("5B", new Teacher("Elizaveta",
                "Pliaskina",
                "Math"));
        Student student1 = new Student("Ivan", "Ivanov", schoolJournal.getNameOfClass());
        Student student2 = new Student("Petr", "Petrov", schoolJournal.getNameOfClass());
        Student student3 = new Student("Dmitrij", "Dmitriev", schoolJournal.getNameOfClass());

        Teacher teacher1 = new Teacher("Elizaveta", "Pliaskina", "Math");
        Teacher teacher2 = new Teacher("Tatiana", "Tonkikh", "Eng");
        Teacher teacher3 = new Teacher("Irina", "Victorova", "Geo");

        SchoolDiary schoolDiary1 = new SchoolDiary(student1);
            Subject subject1SchoolDiary1 = new Subject("Math", teacher1);
            schoolDiary1.addSubjects(subject1SchoolDiary1);
            Subject subject2SchoolDiary1 = new Subject("Eng", teacher2);
            schoolDiary1.addSubjects(subject2SchoolDiary1);
            Subject subject3SchoolDiary1 = new Subject("Geo", teacher3);
            schoolDiary1.addSubjects(subject3SchoolDiary1);
        schoolJournal.addSchoolDairy(schoolDiary1);

        SchoolDiary schoolDiary2 = new SchoolDiary(student2);
            Subject subject1SchoolDiary2 = new Subject("Math", teacher1);
            schoolDiary2.addSubjects(subject1SchoolDiary2);
            Subject subject2SchoolDiary2 = new Subject("Eng", teacher2);
            schoolDiary2.addSubjects(subject2SchoolDiary2);
            Subject subject3SchoolDiary2 = new Subject("Geo", teacher3);
            schoolDiary2.addSubjects(subject3SchoolDiary2);
        schoolJournal.addSchoolDairy(schoolDiary2);

        SchoolDiary schoolDiary3 = new SchoolDiary(student3);
            Subject subject1SchoolDiary3 = new Subject("Math", teacher1);
            schoolDiary3.addSubjects(subject1SchoolDiary3);
            Subject subject2SchoolDiary3 = new Subject("Eng", teacher2);
            schoolDiary3.addSubjects(subject2SchoolDiary3);
            Subject subject3SchoolDiary3 = new Subject("Geo", teacher3);
            schoolDiary3.addSubjects(subject3SchoolDiary3);
        schoolJournal.addSchoolDairy(schoolDiary3);
    return schoolJournal;
    }
}