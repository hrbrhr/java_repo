package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SchoolJournalUI {
    List<String> listOfSubjects = new ArrayList<>();

    void runUI() {

        SchoolJournal schoolJournal = new SchoolJournal("5B", new Teacher("Elizaveta",
                                                                                     "Pliaskina",
                                                                                   "Math"));
        initialValues(schoolJournal); // заполнение начальных значений

        int numberOfMainMenu = 0;
        while (true) {
            printMainJournalMenu();
            numberOfMainMenu = requestIntData("Enter a number of menu: ");
            if ((numberOfMainMenu < 1) || (numberOfMainMenu > 8)) {
                System.out.println("You enter incorrect number of menu!");
            }
            else if(numberOfMainMenu == 1) {
                // печать списка студентов с оценками по всем предметам
                printListOfStudentsWithMarks(schoolJournal);
            }
            else if(numberOfMainMenu == 2) {
                // поиск максимальной оценки в классе по выбранному предмету
                findMaxMarkOfSubjectInClass(schoolJournal, listOfSubjects);
            }
            else if(numberOfMainMenu == 3) {
                // поиск минимальной оценки в классе по выбранному предмету
                findMinMarkOfSubjectInClass(schoolJournal, listOfSubjects);
            }
            else if(numberOfMainMenu == 4) {
                // поиск средней оценки в классе по выбранному предмету
                findAverageMarkOfSubjectInClass(schoolJournal, listOfSubjects);
            }
            else if(numberOfMainMenu == 5) {
                // поиск максимальной оценки в классе по всем предметам
                findMaxMarkInClass(schoolJournal);
            }
            else if(numberOfMainMenu == 6) {
                // поиск минимальной оценки в классе по всем предметам
                findMinMarkInClass(schoolJournal);
            }
            else if(numberOfMainMenu == 7) {
                // поиск средней оценки в классе по всем предметам
                findAverageMarkInClass(schoolJournal);
            }
            else {
                break;
            }
        }
    }

    private static void initialValues(SchoolJournal schoolJournal) {
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
    }

    private static void printMainJournalMenu() {
        System.out.println(" ");
        System.out.println("Main menu:");
        System.out.println("1. Print students with marks");
        System.out.println("2. Find max mark of subject in class");
        System.out.println("3. Find min mark of subject in class");
        System.out.println("4. Find average mark of subject in class");
        System.out.println("5. Find max mark in class");
        System.out.println("6. Find min mark in class");
        System.out.println("7. Find average mark in class");
        System.out.println("8. Exit");
    }

    private static void printListOfSubjects(List<SchoolDiary> schoolDiaries, List<String> listOfSubjects) {
        System.out.println("List of subjects: ");
        String subjectsInOneString = "";
        String resultString = "";
        int i = 1;
        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects){
                if(!subjectsInOneString.contains(subject.getName())) {
                    resultString = i + ". " + subject.getName();
                    subjectsInOneString = subjectsInOneString + " " + subject.getName();
                    listOfSubjects.add(subject.getName());
                    System.out.println(resultString);
                }
                i += 1;
            }
        }
        System.out.println(" ");
    }

    private static int requestIntData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int result = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        return result;
    }

    private static void printListOfStudentsWithMarks(SchoolJournal schoolJournal) {
        List<SchoolDiary> schoolDiaries = schoolJournal.getSchoolDiaries();
        System.out.println("List of marks " + schoolJournal.getNameOfClass() + " class: ");
        System.out.println("Class teacher: " + schoolJournal.getClassTeacher().getLastName() +
                           " " + schoolJournal.getClassTeacher().getFirstName());
        int i = 1;
        for(SchoolDiary schoolDiary: schoolDiaries) {
            System.out.println("Student " + i + ": " + schoolDiary.getStudent().getLastName() +
                               " " + schoolDiary.getStudent().getFirstName());
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                System.out.println("Subject: " + subject.getName());
                subject.showAllMarks();
            }
            i += 1;
            System.out.println(" ");
        }
    }

    private static void findMaxMarkOfSubjectInClass(SchoolJournal schoolJournal, List<String> listOfSubjects) {
        List<SchoolDiary> schoolDiaries = schoolJournal.getSchoolDiaries();
        printListOfSubjects(schoolDiaries, listOfSubjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        if ((numberOfSubject < 1) || (numberOfSubject > listOfSubjects.size())) {
            System.out.println("You enter incorrect number of subject!");
        }
        else {
            String nameOfSubject = listOfSubjects.get(numberOfSubject - 1);
            int maxMark = schoolJournal.findMaxMarkOfSubjectInClass(nameOfSubject);

            System.out.println("Max mark of " + nameOfSubject + ": " + maxMark);
            listOfSubjects.clear();
        }
    }

    private static void findMinMarkOfSubjectInClass(SchoolJournal schoolJournal, List<String> listOfSubjects) {
        List<SchoolDiary> schoolDiaries = schoolJournal.getSchoolDiaries();
        printListOfSubjects(schoolDiaries, listOfSubjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        if ((numberOfSubject < 1) || (numberOfSubject > listOfSubjects.size())) {
            System.out.println("You enter incorrect number of subject!");
        }
        else {
            String nameOfSubject = listOfSubjects.get(numberOfSubject - 1);
            int minMark = schoolJournal.findMinMarkOfSubjectInClass(nameOfSubject);

            System.out.println("Min mark of " + nameOfSubject + ": " + minMark);
            listOfSubjects.clear();
        }
    }

    private static void findAverageMarkOfSubjectInClass(SchoolJournal schoolJournal, List<String> listOfSubjects) {
        List<SchoolDiary> schoolDiaries = schoolJournal.getSchoolDiaries();
        printListOfSubjects(schoolDiaries, listOfSubjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        if ((numberOfSubject < 1) || (numberOfSubject > listOfSubjects.size())) {
            System.out.println("You enter incorrect number of subject!");
        }
        else {
            String nameOfSubject = listOfSubjects.get(numberOfSubject - 1);
            double averageMark = schoolJournal.findAverageMarkOfSubjectInClass(nameOfSubject);

            System.out.println("Min mark of " + nameOfSubject + ": " + averageMark);
            listOfSubjects.clear();
        }
    }

    private static void findMaxMarkInClass(SchoolJournal schoolJournal) {
        int maxMarkInClass = schoolJournal.findMaxMarkInClass();

        System.out.println("Max mark in class: " + maxMarkInClass);
    }

    private static void findMinMarkInClass(SchoolJournal schoolJournal) {
        int minMarkInClass = schoolJournal.findMinMarkInClass();

        System.out.println("Min mark in class: " + minMarkInClass);
    }

    private static void findAverageMarkInClass(SchoolJournal schoolJournal) {
        double averageMarkInClass = schoolJournal.findAverageMarkInClass();

        System.out.println("Average mark in class: " + averageMarkInClass);
    }
}
