package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

import java.util.List;

/**
 * Represents a school diary management application
 */
class SchoolDiaryApp {
    private final SchoolDiary schoolDiary = new SchoolDiary();
    private final SchoolDiaryUI ui = new SchoolDiaryUI();

    public static void main(String[] args) {
        SchoolDiaryApp app = new SchoolDiaryApp();
        app.start();
    }

    /**
     * Runs the app by handling user input in a continuous loop
     */
    public void start() {
        while (true) {
            ui.printMenu();
            int userChoice = ui.getChoice();
            switch (Choice.getByValue(userChoice)) {
                case Choice.ADD:
                    handleAddMark();
                    break;
                case Choice.MAX:
                    handleMaxMark();
                    break;
                case Choice.MIN:
                    handleMinMark();
                    break;
                case Choice.AVERAGE:
                    handleAverage();
                    break;
                case Choice.OVERALL_AVERAGE:
                    handleOverallAverage();
                    break;
                case Choice.ALL:
                    handleAllMarks();
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
     * Handles add mark scenario
     */
    private void handleAddMark() {
        String subject = ui.getSubject();
        int mark = ui.getMark();
        if (mark < 0 || mark > 10) {
            return;
        }
        schoolDiary.addMark(subject, mark);
        ui.printMessage("Subject: " + subject + " - mark " + mark + " added");
    }

    /**
     * Prints max mark scenario for user entered subject
     */
    private void handleMaxMark() {
        String subject = ui.getSubject();
        ui.printMessage("Max mark:");
        ui.printMessage(Integer.toString(schoolDiary.findMax(subject)));
    }

    /**
     * Prints min mark scenario for user entered subject
     */
    private void handleMinMark() {
        ui.printMessage("Min mark:");
        String subject = ui.getSubject();
        ui.printMessage(Integer.toString(schoolDiary.findMin(subject)));
    }

    /**
     * Prints average mark scenario for user entered subject
     */
    private void handleAverage() {
        ui.printMessage("Average mark:");
        String subject = ui.getSubject();
        double average = schoolDiary.findAverageForSubject(subject);
        ui.printMessage(average);
    }

    /**
     * Prints average mark scenario for all subjects
     */
    private void handleOverallAverage() {
        ui.printMessage("Overall average mark:");
        double overallAverage = schoolDiary.findOverallAverage();
        ui.printMessage(overallAverage);
    }

    /**
     * Prints all marks
     */
    private void handleAllMarks() {
        List<Mark> marks = schoolDiary.getAllMarks();
        if (marks.isEmpty()) {
            ui.printMessage("There is no mark!");
        } else {
            ui.printMessage("Marks:");
            for (Mark mark : marks) {
                ui.printMessage(mark.toString());
            }
        }
    }

    /**
     * Exits the application
     */
    private void handleExit() {
        ui.printMessage("Exiting from the app....Done.");
        System.exit(0);
    }
}
