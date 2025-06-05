package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.lessoncode.task_1_plus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SchoolDiaryUI {
    public void runUI() {
        List<Mark> marks = new ArrayList<>();
        SchoolDiary schoolDiary = new SchoolDiary();
        while (true) {
            printMainMenu();
            int numberOfMainMenu = chooseMenuItem();
            if ((numberOfMainMenu < 1) || (numberOfMainMenu > 6)) {
                System.out.println("You enter incorrect number of menu!");
            }
            else if(numberOfMainMenu == 1) {
                printSubjectMenu();
                int numberOfSubject = chooseMenuItem();
                addMark(numberOfSubject, schoolDiary, marks);
            }
            else if(numberOfMainMenu == 2) {
                printSubjectMenu();
                int numberOfSubject = chooseMenuItem();
                findMaxMarkOfSubject(numberOfSubject, schoolDiary, marks);
            }
            else if(numberOfMainMenu == 3) {
                printSubjectMenu();
                int numberOfSubject = chooseMenuItem();
                findMinMarkOfSubject(numberOfSubject, schoolDiary, marks);
            }
            else if(numberOfMainMenu == 4) {
                printSubjectMenu();
                int numberOfSubject = chooseMenuItem();
                findAverageMarkOfSubject(numberOfSubject, schoolDiary, marks);
            }
            else if(numberOfMainMenu == 5) {
                printSubjectMenu();
                findAverageMarkOfAllSubject(schoolDiary, marks);
            }
            else if(numberOfMainMenu == 6) {
                break;
            }
        }
    }

    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("Main menu:");
        System.out.println("1. Add mark");
        System.out.println("2. Find max mark of subject");
        System.out.println("3. Find min mark of subject");
        System.out.println("4. Find average mark of subject");
        System.out.println("5. Find average mark of all subject");
        System.out.println("6. Exit");
    }

    private static void printSubjectMenu() {
        System.out.println(" ");
        System.out.println("Select a subject: ");
        System.out.println("1. Math");
        System.out.println("2. Eng");
        System.out.println("3. Geo");
        System.out.println("4. Back to main menu");
    }

    private static int chooseMenuItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an item from the list: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int markOfSubject() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static void addMark(int numberOfSubject, SchoolDiary schoolDiary, List<Mark> marks) {
        if((numberOfSubject < 1) || (numberOfSubject > 4)) {
            System.out.println("You enter incorrect number of subject menu!");
        }
        else if(numberOfSubject == 1) {
            System.out.print("Enter a mark: ");
            int markValue = markOfSubject();
            Mark mark = new Mark("Math", markValue);
            marks.add(mark);
        }
        else if(numberOfSubject == 2) {
            System.out.print("Enter a mark: ");
            int markValue = markOfSubject();
            Mark mark = new Mark("Eng", markValue);
            marks.add(mark);
        }
        else if(numberOfSubject == 3) {
            System.out.print("Enter a mark: ");
            int markValue = markOfSubject();
            Mark mark = new Mark("Geo", markValue);
            marks.add(mark);
        }
        else {
            System.out.println(" ");
        }
    }

    private static void findMaxMarkOfSubject(int numberOfSubject, SchoolDiary schoolDiary, List<Mark> marks) {
        int maxMark = 0;
        if((numberOfSubject < 1) || (numberOfSubject > 4)){
            System.out.println("You enter incorrect number of subject menu!");
        }
        else if(numberOfSubject == 1) {
            maxMark = schoolDiary.findMaxMarkOfSubject(marks, "Math");
            System.out.println("Max mark of math: " + maxMark);
        }
        else if(numberOfSubject == 2) {
            maxMark = schoolDiary.findMaxMarkOfSubject(marks, "Eng");
            System.out.println("Max mark of eng: " + maxMark);
        }
        else if(numberOfSubject == 3) {
            maxMark = schoolDiary.findMaxMarkOfSubject(marks, "Geo");
            System.out.println("Max mark of geo: " + maxMark);
        }
        else {
            System.out.println(" ");
        }
    }

    private static void findMinMarkOfSubject(int numberOfSubject, SchoolDiary schoolDiary, List<Mark> marks) {
        int minMark = 0;
        if((numberOfSubject < 1) || (numberOfSubject > 4)){
            System.out.println("You enter incorrect number of subject menu!");
        }
        else if(numberOfSubject == 1) {
            minMark = schoolDiary.findMinMarkOfSubject(marks, "Math");
            System.out.println("Min mark of math: " + minMark);
        }
        else if(numberOfSubject == 2) {
            minMark = schoolDiary.findMinMarkOfSubject(marks, "Eng");
            System.out.println("Min mark of eng: " + minMark);
        }
        else if(numberOfSubject == 3) {
            minMark = schoolDiary.findMinMarkOfSubject(marks, "Geo");
            System.out.println("Min mark of geo: " + minMark);
        }
        else {
            System.out.println(" ");
        }
    }
    private static void findAverageMarkOfSubject(int numberOfSubject, SchoolDiary schoolDiary, List<Mark> marks) {
        double averageMark = 0.0d;
        if((numberOfSubject < 1) || (numberOfSubject > 4)){
            System.out.println("You enter incorrect number of subject menu!");
        }
        else if(numberOfSubject == 1) {
            averageMark = schoolDiary.findAverageMarkOfSubject(marks, "Math");
            System.out.println("Average mark of math: " + averageMark);
        }
        else if(numberOfSubject == 2) {
            averageMark = schoolDiary.findAverageMarkOfSubject(marks, "Eng");
            System.out.println("Average mark of eng: " + averageMark);
        }
        else if(numberOfSubject == 3) {
            averageMark = schoolDiary.findAverageMarkOfSubject(marks, "Geo");
            System.out.println("Average mark of geo: " + averageMark);
        }
        else {
            System.out.println(" ");
        }
    }
    private static void findAverageMarkOfAllSubject(SchoolDiary schoolDiary, List<Mark> marks) {
        double averageMark = schoolDiary.findAverageMarkOfAllSubject(marks);
        System.out.println("Average mark of all subjects: " + averageMark);
    }
}
