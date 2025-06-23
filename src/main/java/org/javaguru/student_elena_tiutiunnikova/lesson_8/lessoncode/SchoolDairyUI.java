package org.javaguru.student_elena_tiutiunnikova.lesson_8.lessoncode;

import java.util.Scanner;

class SchoolDairyUI {

    private SchoolDairy schoolDairy;
    SchoolDairyUI(SchoolDairy schoolDairy) {
        this.schoolDairy = schoolDairy;
    }

    void start() {
//        for (int i = 0; i < 1; ) {
//        } аналогично while
        while (true) {

            printMenu();

            int userChoice = getUserChoice();

            if (userChoice == 1) {
                addNewMark();
            }

            if (userChoice == 2) {
                findMaxMarkBySubject();
            }

            if (userChoice == 3) {
                findMinMarkBySubject();
            }

            if (userChoice == 4) {
                findAverageMarkBySubject();
            }

            if (userChoice == 5) {
                findAverageMarkByAllSubjects();
            }

            if (userChoice == 6) {
               exitProgram();
                //break; но тогда ее нельзя выносить и должен остаться в цикле
            }

        }
    }

    private void printMenu () {
        System.out.println();
        System.out.println("Program menu: ");
        System.out.println("1. Add mark");
        System.out.println("2. Find max mark by subject");
        System.out.println("3. Find min mark by subject");
        System.out.println("4. Find average mark by subject");
        System.out.println("5. Find average mark by all subjects");
        System.out.println("6. Exit");
    }

    private int getUserChoice () {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    };

    private void addNewMark () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.println("Enter mark: ");
        int mark = Integer.parseInt(scanner.nextLine());

        schoolDairy.addMark(subject, mark);
        System.out.println();
        System.out.println("Mark added!");
    }

    private void findMaxMarkBySubject () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int maxMark = schoolDairy.findMaxMark(subject);
        System.out.println();
        System.out.println("Max grade " + subject + " is " + maxMark);
    }

    private void findMinMarkBySubject () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int minMark = schoolDairy.findMinMark(subject);
        System.out.println();
        System.out.println("Min grade " + subject + " is " + minMark);
    }

    private void findAverageMarkBySubject () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        double averageMarkBySubject = schoolDairy.findAverageMarkForTheSubject(subject);
        System.out.println();
        System.out.println("Average grade " + subject + " is " + averageMarkBySubject);
    }

    private void findAverageMarkByAllSubjects () {
        double averageMark = schoolDairy.findAverageMark();
        System.out.println();
        System.out.println("Average grade of all subjects is " + averageMark);
    }

    private void exitProgram () {
        System.out.println();
        System.out.println("Program end! Goodbye!");
        System.exit(0);
    }

}


