package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_5;

import java.util.List;
import java.util.Scanner;

class ReviewSystemUI {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Prints the menu to the console
     */
    public void printMenu() {
        System.out.println("==========================");
        System.out.println("\t\t MENU:");
        System.out.println("==========================");
        System.out.println(Choice.ADD.getValue() + ". Add review");
        System.out.println(Choice.REMOVE.getValue() + ". Remove review");
        System.out.println(Choice.ALL.getValue() + ". Show all review");
        System.out.println(Choice.MAX.getValue() + ". Find max mark");
        System.out.println(Choice.MIN.getValue() + ". Find min mark");
        System.out.println(Choice.AVERAGE.getValue() + ". Find average mark");
        System.out.println(Choice.EXIT.getValue() + ". Exit");
        System.out.println("==========================");
    }

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

    /**
     * Prints given message to console
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Gets review's author name from console
     *
     * @return review's author name from console
     */
    public String getReviewAuthor() {
        System.out.print("Input review's author: ");
        return scanner.nextLine();
    }

    /**
     * Gets review's text from console
     *
     * @return review's text from console
     */
    public String getReviewText() {
        System.out.print("Input review's text: ");
        return scanner.nextLine();
    }

    /**
     * Gets review's mark from console
     *
     * @return review's mark from console
     */
    public int getReviewMark() {
        System.out.print("Input review's mark: ");
        return readInt();
    }

    /**
     * Gets number of review to remove
     *
     * @return number of review to remove
     */
    public int getRemoveReviewNumber() {
        System.out.print("Input review's number to remove: ");
        return readInt();
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
     * Prints given reviews to the console
     *
     * @param reviews
     */
    public void printAllReviews(List<Review> reviews) {
        if (reviews.isEmpty()) {
            printMessage("There is no reviews!");
        } else {
            printMessage("All reviews:");
            for (Review review : reviews) {
                printMessage(review.toString());
            }
        }
    }
}
