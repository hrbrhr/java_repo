package org.javaguru.student_anastassija.lesson_3;

public class PupilApplication {

    public static void main(String[] args) {

        Pupil pupil1 = new Pupil("Darja",5);
        Pupil pupil2 = new Pupil("Kostja",4);
        Pupil pupil3 = new Pupil("Olga",3);
        Pupil pupil4 = new Pupil("Ivan",5);



        String pupil_2 = pupil2.getName();
        int grade_2 = pupil2.getGrade();
        System.out.println("Pupil's name: " + pupil_2);
        System.out.println("Pupil's grade : " + grade_2);
    }
}
