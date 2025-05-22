package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_8_plus;

public class RequestNumberFromUserApp {
    public static void main(String[] args) {
        RequestNumberFromUser request = new RequestNumberFromUser();
        int answer1 = request.execute();
        System.out.println("Number is: " + answer1);

        String testOfQuestion = "Enter new number: ";
        int answer2 = request.executeWithText(testOfQuestion);
        System.out.println("New number is: " + answer2);
    }
}
