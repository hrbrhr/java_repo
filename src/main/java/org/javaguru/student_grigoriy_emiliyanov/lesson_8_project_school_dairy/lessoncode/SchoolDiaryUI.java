package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

import java.util.List;
import java.util.Scanner;

/**
 * Represents a school diary application user interface
 */
class SchoolDiaryUI {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Returns entered choice or Integer.MIN_VALUE if error
     *
     * @return entered choice or Integer.MIN_VALUE if error
     */
    public int getChoice() {
        System.out.print("Input your choice: ");
        return readInt();
    }

    /**
     * Returns entered subject
     *
     * @return entered subject
     */
    public String getSubject() {
        System.out.print("Input your subject: ");
        return scanner.nextLine();
    }

    /**
     * Returns entered mark or Integer.MIN_VALUE if error
     *
     * @return entered mark or Integer.MIN_VALUE if error
     */
    public int getMark() {
        System.out.print("Input your mark: ");
        return readInt();
    }

    /**
     * Print given text to the user console
     *
     * @param text
     */
    public void printMessage(String text) {
        System.out.println(text);
    }

    /**
     * Print given text and given value separated by colon
     *
     * @param text
     * @param value
     */
    public void printInformation(String text, double value) {
        System.out.println(text + ": " + value);
    }

    /**
     * Prints all given marks
     *
     * @param marks
     */
    public void printAllMarks(List<Mark> marks) {
        if (marks.isEmpty()) {
            printMessage("There is no mark!");
        } else {
            printMessage("Marks:");
            for (Mark mark : marks) {
                printMessage(mark.toString());
            }
        }
    }

    /**
     * Prints the menu to the console
     */
    public void printMenu() {
        System.out.println("==========================");
        System.out.println("\t\t MENU:");
        System.out.println("==========================");
        System.out.println(Choice.ADD.getValue() + ". Add mark");
        System.out.println(Choice.MAX.getValue() + ". Find max for subject");
        System.out.println(Choice.MIN.getValue() + ". Find min for subject");
        System.out.println(Choice.AVERAGE.getValue() + ". Find average for subject");
        System.out.println(Choice.OVERALL_AVERAGE.getValue() + ". Find overall average");
        System.out.println(Choice.ALL.getValue() + ". Show all marks");
        System.out.println(Choice.EXIT.getValue() + ". Exit");
        System.out.println("==========================");
    }

    /**
     * Reads an integer from the console and returns it.
     * If error Integer.MIN_VALUE is returned.
     *
     * @return integer or Integer.MIN_VALUE if case of error
     */
    private int readInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }
}
