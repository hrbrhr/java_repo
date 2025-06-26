package org.javaguru.student_aleksey_volokitin.lesson_8_plus_project_school_diary.homework_plus.day_7_plus;

class SchoolDiaryApp {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Petrov", "4B");
        SchoolDiary schoolDiary = new SchoolDiary(student1);
        SchoolDiaryUI schoolDiaryUI = new SchoolDiaryUI(schoolDiary);
        schoolDiaryUI.runUI();
    }
}
