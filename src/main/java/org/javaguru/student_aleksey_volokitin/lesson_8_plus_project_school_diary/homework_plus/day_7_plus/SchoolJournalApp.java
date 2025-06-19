package org.javaguru.student_aleksey_volokitin.lesson_8_plus_project_school_diary.homework_plus.day_7_plus;

class SchoolJournalApp {
    public static void main(String[] args) {
        SchoolJournal schoolJournal = new SchoolJournal("5B", new Teacher("Elizaveta",
                                                                                      "Pliaskina",
                                                                                    "Math"));
        SchoolJournalUI schoolJournalUI = new SchoolJournalUI(schoolJournal);
        schoolJournalUI.runUI();
    }
}
