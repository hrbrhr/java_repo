package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class QuestionApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your question text:");
        String text = scanner.nextLine();
        System.out.println("Enter your answer [true/false]:");
        boolean answer = scanner.nextBoolean();
        Question question = new Question(text, answer);
        System.out.println("Your question was:");
        System.out.println(question.getText());
        System.out.println("The answer is: " + question.getAnswer());

    }
}
