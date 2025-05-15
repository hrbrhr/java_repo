package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode_plus.task_13_plus;

class SubjectOfQuestionary {
    String name;
    Questionary questionary1;
    Questionary questionary2;
    Questionary questionary3;

    SubjectOfQuestionary(String name,
                         Questionary questionary1,
                         Questionary questionary2,
                         Questionary questionary3) {
        this.name = name;
        this.questionary1 = questionary1;
        this.questionary2 = questionary2;
        this.questionary3 = questionary3;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
