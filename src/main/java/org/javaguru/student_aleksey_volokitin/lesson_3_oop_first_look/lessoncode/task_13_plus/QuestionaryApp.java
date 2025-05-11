package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_13_plus;

class QuestionaryApp {
    public static void main(String[] args) {

        Questionary subject1Questionary1 = new Questionary(1, "Is it 2025 now?      ", true);
        Questionary subject1Questionary2 = new Questionary(2, "Your name is Aleksey?", true);
        Questionary subject1Questionary3 = new Questionary(3, "You are working now? ", true);
        SubjectOfQuestionary subject1 = new SubjectOfQuestionary("Aleksey",
                                                                       subject1Questionary1,
                                                                       subject1Questionary2,
                                                                       subject1Questionary3);

        Questionary subject2Questionary1 = new Questionary(1, "Is it 2025 now?      ", true);
        Questionary subject2Questionary2 = new Questionary(2, "Your name is Aleksey?", false);
        Questionary subject2Questionary3 = new Questionary(3, "You are working now? ", false);
        SubjectOfQuestionary subject2 = new SubjectOfQuestionary("Dmitriy",
                                                                       subject2Questionary1,
                                                                       subject2Questionary2,
                                                                       subject2Questionary3);

        printingQuestionary(subject1);
        printingQuestionary(subject2);
    }

    private static void printingQuestionary(SubjectOfQuestionary subject) {
        System.out.println("Your name " + subject.getName() +
                           ", your answers to the questions:");
        System.out.println("Question " + subject.questionary1.getNumber() +
                           ": " + subject.questionary1.getText() +
                           ", your answer: " + subject.questionary1.getAnswer());
        System.out.println("Question " + subject.questionary2.getNumber() +
                ": " + subject.questionary2.getText() +
                ", your answer: " + subject.questionary2.getAnswer());
        System.out.println("Question " + subject.questionary3.getNumber() +
                ": " + subject.questionary3.getText() +
                ", your answer: " + subject.questionary3.getAnswer() +
                "\n");
    }

}
