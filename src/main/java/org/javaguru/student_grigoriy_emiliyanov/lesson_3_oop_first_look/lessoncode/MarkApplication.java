package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class MarkApplication {
    public static void main(String[] args) {
        Mark mark = new Mark("Ivan", "Ivanov", "Math", "A");

        System.out.println("Mark:");
        System.out.println("Strudent first name: " + mark.getStudentFirstName());
        System.out.println("Strudent last name: " + mark.getStudentLastName());
        System.out.println("Mark on subject: " + mark.getSubject());
        System.out.println("Grade: " + mark.getGrade());
    }
}
