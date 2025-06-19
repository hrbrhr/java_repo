package org.javaguru.student_aleksey_volokitin.lesson_8_plus_project_school_diary.homework_plus.day_6_plus;


import java.util.List;
import java.util.Scanner;

class SchoolDiaryUI {
    private SchoolDiary schoolDiary;

    public SchoolDiaryUI(SchoolDiary schoolDiary) {
        this.schoolDiary = schoolDiary;
    }

    public void runUI() {
        int numberOfSubject;

        List<Subject> subjects = schoolDiary.subjects;

        initialValues(subjects); // заполнение начальных значений

        while (true) {
            printMainMenu();
            int numberOfMainMenu = requestIntData("Enter a number of menu: ");
            if ((numberOfMainMenu < 1) || (numberOfMainMenu > 12)) {
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
                numberOfSubject = requestIntData("Enter number of subject: ");
                printMarksOfSubject(subjects, numberOfSubject);
            }
            else if(numberOfMainMenu == 7) {
                // печать всех оценок по всем предметам
                printAllMarks(subjects);
            }
            else if(numberOfMainMenu == 8) {
                // поиск максимальной оценки по предмету
                findMaxMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 9) {
                // поиск минимальной оценки по предмету
                findMinMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 10) {
                // поиск средней оценки по предмету
                findAverageMarkOfSubject(subjects);
            }
            else if(numberOfMainMenu == 11) {
                // поиск средней оценки по всем предметам
                findAverageMarkOfAllSubject(schoolDiary);
            }
            else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    private void initialValues(List<Subject> subjects) {
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

    private void printMainMenu() {
        System.out.println(" ");
        System.out.println("Main menu:");
        System.out.println("1. Add new subject");
        System.out.println("2. Remove subject");
        System.out.println("3. Add new mark");
        System.out.println("4. Correction mark");
        System.out.println("5. Remove mark");
        System.out.println("6. Print marks of subject");
        System.out.println("7. Print marks of all subject");
        System.out.println("8. Find max mark of subject");
        System.out.println("9. Find min mark of subject");
        System.out.println("10. Find average mark of subject");
        System.out.println("11. Find average mark of all subject");
        System.out.println("12. Exit");
    }

    private void printListOfSubjects(List<Subject> subjects) {
        System.out.println("List of subjects: ");
        int i = 1;
        for(Subject subject: subjects) {
            String resultString = i + ". " + subject.getName();
            System.out.println(resultString);
            i += 1;
        }
        System.out.println(" ");
    }

    private void printMarksOfSubject(List<Subject> subjects, int numberOfSubject) {
        Subject subject = subjects.get(numberOfSubject - 1);
        subject.showAllMarks();
    }

    private void printAllMarks(List<Subject> subjects) {
        for (Subject subject: subjects) {
            System.out.println("Subject: " + subject.getName());
            subject.showAllMarks();
            System.out.println();
        }
    }

    private int requestIntData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int result = Integer.parseInt(scanner.nextLine().strip());
        System.out.println(" ");
        return result;
    }

    private String requestStringData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLine();
    }

    private void addNewSubject(List<Subject> subjects) {
        String name = requestStringData("Enter name of subject: ");
        String firstNameOfTeacher = requestStringData("Enter firstname of teacher: ");
        String lastNameOfTeacher = requestStringData("Enter lastname of teacher: ");
        String qualificationOfTeacher = requestStringData("Enter qualification of teacher: ");
        Subject subject = new Subject(name, new Teacher(firstNameOfTeacher,
                                                        lastNameOfTeacher,
                                                        qualificationOfTeacher));
        subjects.add(subject);
        System.out.println("Subject added!");
    }

    private void removeSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        subjects.remove(numberOfSubject - 1);
        System.out.println("Subject removed!");
    }

    private void addNewMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);

        String date = requestStringData("Enter date of mark: ");
        int markGrade = requestIntData("Enter mark: ");
        subject.addMark(date, markGrade);
        System.out.println("Mark added!");
    }

    private void correctionMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        printMarksOfSubject(subjects, numberOfSubject);
        int numberOfMark = requestIntData("Enter number of mark: ");
        int newMarkGrade = requestIntData("Enter corrections mark: ");

        Subject subject = subjects.get(numberOfSubject - 1);
        subject.correctionMark(numberOfMark - 1, newMarkGrade);
        System.out.println("Mark corrected!");
    }

    private void removeMark(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        printMarksOfSubject(subjects, numberOfSubject);
        int numberOfMark = requestIntData("Enter number of mark: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        subject.removeMark(numberOfMark - 1);
        System.out.println("Mark removed!");
    }

    private void findMaxMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", max mark: " + subject.findMaxMarkOfSubject());
    }

    private void findMinMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", max mark: " + subject.findMinMarkOfSubject());
    }

    private void findAverageMarkOfSubject(List<Subject> subjects) {
        printListOfSubjects(subjects);
        int numberOfSubject = requestIntData("Enter number of subject: ");
        Subject subject = subjects.get(numberOfSubject - 1);
        System.out.println("Subject: " + subject.getName() +
                ", average mark: " + subject.findAverageMarkOfSubject());
    }

    private void findAverageMarkOfAllSubject(SchoolDiary schoolDiary) {
        System.out.println("Average mark of all subject: " + schoolDiary.findAverageMarkOfAllSubjects());
    }
}
