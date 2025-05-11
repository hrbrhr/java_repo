package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_12_plus;

class QuestionaryApp {
    public static void main(String[] args) {
        Questionary questionary1 = new Questionary(1, "Is it 2025 now?", true);
        Questionary questionary2 = new Questionary(2, "Your name is Aleksey?", true);
        Questionary questionary3 = new Questionary();

        printQuestion(questionary1);
        printQuestion(questionary2);
        printQuestion(questionary3);

        questionary3.setNumber(3);
        questionary3.setText("You are working now?");
        questionary3.setAnswer(true);

        printQuestion(questionary3);

    }
    private static void printQuestion (Questionary questionary) {
        System.out.println("Question " + questionary.getNumber() +
                ": " + questionary.getText() +
                ", answer: " + questionary.getAnswer());
    }
}
