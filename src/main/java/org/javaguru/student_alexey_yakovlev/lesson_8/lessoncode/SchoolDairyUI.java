package org.javaguru.student_alexey_yakovlev.lesson_8.lessoncode;

import java.util.Scanner;

class SchoolDairyUI {

    private SchoolDairy schoolDairy;

    public SchoolDairyUI(SchoolDairy schoolDairy) {
        this.schoolDairy = schoolDairy;
    }

    void start() {
        while (true) {
            printMenu();

            int userChoice = getUserChoice();

            if (userChoice == 1) {
                // 1. Add new mark:
                addNewMark();
            }

            if (userChoice == 2) {
                // 2. Find max mark by subject:
                findMaxMarkSubject();
            }

            if (userChoice == 3) {
                // 3. Find min mark by subject:
                findMinMarkSubject();
            }

            if (userChoice == 4) {
                // 4. Find avg mark by subject:
                findAvgMarkSubject();
            }

            if (userChoice == 5) {
                // 5. Find total avg mark by subject:
                findTotalAvgMarkSubject();
            }

            if (userChoice == 6) {
                // 6. Exit
                exitProgram();
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Program menu: ");
        System.out.println("1. Add new mark: ");
        System.out.println("2. Find max mark by subject: ");
        System.out.println("3. Find min mark by subject:");
        System.out.println("4. Find avg mark by subject: ");
        System.out.println("5. Find total avg mark : ");
        System.out.println("6. Exit");
    }

    private int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your choice (number): ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void addNewMark() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.println("Enter mark: ");
        int mark = scanner.nextInt();

        schoolDairy.addMark(subject, mark);

        System.out.println("Mark added!");
    }

    private void findMaxMarkSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int maxMark = schoolDairy.findMaxMark(subject);

        System.out.println("Max Mark for" + subject + " is " + maxMark);
    }

    private void findMinMarkSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int minMark = schoolDairy.findMinMark(subject);

        System.out.println("Min Mark for" + subject + " is " + minMark);
    }

    private void findAvgMarkSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        double avgMark = schoolDairy.findAvgMark(subject);

        System.out.println("Avg Mark for" + subject + " is " + avgMark);
    }

    private void findTotalAvgMarkSubject() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter subject: ");
//        String subject = scanner.nextLine();

        double totalAvgMark = schoolDairy.findTotalAvgMark();

        System.out.println("Total avg Mark is " + totalAvgMark);
    }

    private void  exitProgram() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

}
