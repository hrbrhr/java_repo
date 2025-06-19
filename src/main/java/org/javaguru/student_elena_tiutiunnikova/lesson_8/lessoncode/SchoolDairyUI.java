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
        System.out.println("3. Exit");
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

    private void exitProgram () {
        System.out.println();
        System.out.println("Program end! Goodbye!");
        System.exit(0);
    }

}


