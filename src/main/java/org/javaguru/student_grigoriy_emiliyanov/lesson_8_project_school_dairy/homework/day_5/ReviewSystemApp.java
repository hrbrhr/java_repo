package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_5;

import java.util.List;

/**
 * Represents a Review system application
 */
class ReviewSystemApp {
    private final ReviewSystemUI ui = new ReviewSystemUI();
    private final ReviewSystem reviewSystem = new ReviewSystem();

    public static void main(String[] args) {
        ReviewSystemApp reviewSystemApp = new ReviewSystemApp();
        reviewSystemApp.start();
    }

    /**
     * Runs the app by handling user input in a continuous loop
     */
    private void start() {
        while (true) {
            ui.printMenu();
            int userChoice = ui.getChoice();
            switch (Choice.getByValue(userChoice)) {
                case Choice.ADD:
                    handleAddReview();
                    break;
                case Choice.REMOVE:
                    handleRemoveReview();
                    break;
                case Choice.ALL:
                    handleAllReviews();
                    break;
                case Choice.MAX:
                    handleMaxMarkReview();
                    break;
                case Choice.MIN:
                    handleMinMarkReview();
                    break;
                case Choice.AVERAGE:
                    handleAverageMark();
                    break;
                case Choice.EXIT:
                    handleExit();
                    break;
                default:
                    System.out.println("Enter number between 1 and " + (Choice.values().length - 1));
            }
        }
    }


    /**
     * Handles add review scenario
     */
    private void handleAddReview() {
        String author = ui.getReviewAuthor();
        String text = ui.getReviewText();
        int mark = ui.getReviewMark();
        if (!reviewSystem.isValidMark(mark)) {
            return;
        }
        reviewSystem.addReview(author, text, mark);
        ui.printMessage("Author: " + author + " - text: " + mark + " - mark: " + mark);
    }

    /**
     * Handles remove review scenario
     */
    private void handleRemoveReview() {
        List<Review> reviews = reviewSystem.getAllReviews();
        ui.printAllReviews(reviews);
        int numberToRemove = ui.getRemoveReviewNumber();
        Review reviewToRemove = reviewSystem.removeReview(numberToRemove);
        ui.printMessage("Removed review:");
        ui.printMessage(reviewToRemove.toString());
    }

    /**
     * Prints max mark scenario
     */
    private void handleMaxMarkReview() {
        int max = reviewSystem.findMax();
        ui.printInformation("Max mark:", max);
    }

    /**
     * Prints min mark scenario
     */
    private void handleMinMarkReview() {
        int min = reviewSystem.findMin();
        ui.printInformation("Min mark:", min);
    }

    /**
     * Prints average mark scenario
     */
    private void handleAverageMark() {
        double average = reviewSystem.findAverage();
        ui.printInformation("Average mark:", average);
    }

    /**
     * Prints all reviews
     */
    private void handleAllReviews() {
        List<Review> reviews = reviewSystem.getAllReviews();
        ui.printAllReviews(reviews);
    }

    /**
     * Exits the application
     */
    private void handleExit() {
        ui.printMessage("Exiting from the app....Done.");
        System.exit(0);
    }
}
