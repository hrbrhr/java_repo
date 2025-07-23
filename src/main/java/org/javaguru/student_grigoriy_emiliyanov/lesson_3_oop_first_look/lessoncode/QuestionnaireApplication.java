package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class QuestionnaireApplication {
    public static void main(String[] args) {
        Question question1 = new Question("Is sky red?", false);
        Question question2 = new Question("Do you have 2 legs?", true);
        Question question3 = new Question("Are the Earth flat?", false);
        Question question4 = new Question("Do you have 2 eyes?", true);
        Questionnaire questionnaire1 = new Questionnaire("Ivan", question1, question2);
        Questionnaire questionnaire2 = new Questionnaire("Niko", question3, question4);
        System.out.println(questionnaire1.getResponderName() + " answered to questions:");
        System.out.println(questionnaire1.getQuestion1());
        System.out.println(questionnaire1.getQuestion2());
        System.out.println();
        System.out.println(questionnaire2.getResponderName() + " answered to questions:");
        System.out.println(questionnaire2.getQuestion1());
        System.out.println(questionnaire2.getQuestion2());
    }
}
