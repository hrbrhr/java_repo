package org.javaguru.student_evgenii_pashtaev.lesson_8.lessoncode;

import java.util.Scanner;

class SchoolDairyUI {

    private SchoolDairy schoolDairy;

    SchoolDairyUI(SchoolDairy schoolDairy){
        this.schoolDairy = schoolDairy;
    }

    void start(){
        while (true){

            printMenu();
            int userChoice =getUserChoice();

            if (userChoice == 1) {
                addMark();
            }

            if (userChoice == 2) {
                findMaxMark();
            }

            if (userChoice == 3) {
                exitProgram();
            }
        }
    }

    private void printMenu(){
        System.out.println("\u001B[32m" + "Menu:");
        System.out.println("1. Add new mark");
        System.out.println("2. Find maximum mark");
        System.out.println("3. Exit" + "\u001B[0m");
    }

    private int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter you choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        return userChoice;
    }

    private void addMark(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.println("Enter mark: ");
        int mark = Integer.parseInt(scanner.nextLine());

        schoolDairy.addMark(subject, mark);

        System.out.println("Mark added!");
    }
    private void findMaxMark(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();

        int maxGrade = schoolDairy.findMaxMark(subject);

        System.out.println("Max grade for " + subject + " is " + maxGrade);
    }

    private void exitProgram(){
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
