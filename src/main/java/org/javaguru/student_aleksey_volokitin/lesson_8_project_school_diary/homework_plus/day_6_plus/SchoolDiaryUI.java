package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_6_plus;


import java.util.List;
import java.util.Scanner;

class SchoolDiaryUI {

    public void runUI() {
        int numberOfSubject;
        Student student1 = new Student("Ivan", "Petrov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);

        List<Subject> subjects = schoolDiary.subjects;

        initialValues(subjects); // заполнение начальных значений

        while (true) {
            printMainMenu();
            int numberOfMainMenu = requestIntData("Enter a number of menu: ");
            if ((numberOfMainMenu < 1) || (numberOfMainMenu > 11)) {
                System.out.println("You enter incorrect number of menu!");
            }
            else if(numberOfMainMenu == 1) {
                // добавление нового предмета
                addNewSubject(subjects);
            }
            else if(numberOfMainMenu == 2) {
                // удаление предмета
                removeSubject(subjects);
            }
            else if(numberOfMainMenu == 3) {
                // добавление оценки
                addNewMark(subjects);
            }
            else if(numberOfMainMenu == 4) {
                // исправление оценки
                correctionMark(subjects);
            }
            else if(numberOfMainMenu == 5) {
                // удаление оценки
                removeMark(subjects);
            }
            else if(numberOfMainMenu == 6) {
                // вывод всех оценок по предмету
                printListOfSubjects(subjects);
                numberOfSubject = requestIntData("Enter number of subject: "); // Water
                printMarksOfSubject(subjects, numberOfSubject);
            }
            else if(numberOfMainMenu == 7) {
                // поиск максимальной оценки по предмету
                findMaxMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 8) {
                // поиск минимальной оценки по предмету
                findMinMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 9) {
                // поиск средней оценки по предмету
                findAverageMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 10) {
                // поиск средней оценки по всем предметам
                findAverageMarkOfAllSubject(schoolDiary);
            }
            else {
                break;
            }
        }
    }

    private static void initialValues(List<Subject> subjects) {
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
        subject2.addMark("16.09.2025", 5);
        subject2.addMark("18.09.2025", 5);
        subjects.add(subject2);
    }

    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("Main menu:");
        System.out.println("1. Add new subject");
        System.out.println("2. Remove subject");
        System.out.println("3. Add new mark");
        System.out.println("4. Correction mark");
        System.out.println("5. Remove mark");
        System.out.println("6. Return all marks");
        System.out.println("7. Find max mark of subject");
        System.out.println("8. Find min mark of subject");
        System.out.println("9. Find average mark of subject");
        System.out.println("10. Find average mark of all subject");
        System.out.println("11. Exit");
    }

    private static void printListOfSubjects(List<Subject> subjects) {
        System.out.println("List of subjects: ");
        int i = 1;
        for(Subject subject: subjects) {
            String resultString = i + ". " + subject.getName();
            System.out.println(resultString);
            i += 1;
        }
        System.out.println(" ");
    }

    private static void printMarksOfSubject(List<Subject> subjects, int numberOfSubject) {
        Subject subject = subjects.get(numberOfSubject - 1);
        subject.showAllMarks();
    }

    private static int requestIntData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int result = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        return result;
    }

    private static String requestStringData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String result = scanner.nextLine();
        return result;
    }

    private static void addNewSubject(List<Subject> subjects) {
        String name = requestStringData("Enter name of subject: ");
        String firstNameOfTeacher = requestStringData("Enter firstname of teacher: ");
        String lastNameOfTeacher = requestStringData("Enter lastname of teacher: ");
        String qualificationOfTeacher = requestStringData("Enter qualification of teacher: ");
        Subject subject = new Subject(name, new Teacher(firstNameOfTeacher,
                                                        lastNameOfTeacher,
                                                        qualificationOfTeacher));
        subjects.add(subject);
    }

    private static void removeSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: "); // Water
        subjects.remove(numberOfSubject - 1);
    }

    private static void addNewMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: "); // Water
        Subject subject = subjects.get(numberOfSubject - 1);

        String date = requestStringData("Enter date of mark: "); // Ivan
        int markGrade = requestIntData("Enter mark: "); // 4;
        subject.addMark(date, markGrade);
    }

    private static void correctionMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: "); // Water
        printMarksOfSubject(subjects, numberOfSubject);
        int numberOfMark = requestIntData("Enter number of mark: ");
        int newMarkGrade = requestIntData("Enter corrections mark: ");

        Subject subject = subjects.get(numberOfSubject - 1);
        subject.correctionMark(numberOfMark - 1, newMarkGrade);
    }

    private static void removeMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: "); // Water
        printMarksOfSubject(subjects, numberOfSubject);
        int numberOfMark = requestIntData("Enter number of mark: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        subject.removeMark(numberOfMark - 1);
    }

    private static void findMaxMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", max mark: " + subject.findMaxMarkOfSubject());
    }

    private static void findMinMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", max mark: " + subject.findMinMarkOfSubject());
    }

    private static void findAverageMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", average mark: " + subject.findAverageMarkOfSubject());
    }

    private static void findAverageMarkOfAllSubject(SchoolDiary schoolDiary) {
        System.out.println("Average mark of all subject: " + schoolDiary.findAverageMarkOfAllSubjects());
    }





}
