package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_6_plus;

class SchoolTabelApp {
    public static void main(String[] args) {

        SchoolSubject student1Subject1 = new SchoolSubject("Russian language", 5,4,5,5,5);
        SchoolSubject student1Subject2 = new SchoolSubject("Mathematics     ", 5,5,5,5,5);
        SchoolSubject student1Subject3 = new SchoolSubject("Geometry        ", 5,4,4,5,5);
        StudentTabel student1 = new StudentTabel("Ivanov Ivan",
                                              "4B",
                                                          student1Subject1,
                                                          student1Subject2,
                                                          student1Subject3);

        SchoolSubject student2Subject1 = new SchoolSubject("Russian language", 5,4,3,4,5);
        SchoolSubject student2Subject2 = new SchoolSubject("Mathematics     ", 5,4,5,4,5);
        SchoolSubject student2Subject3 = new SchoolSubject("Geometry        ", 5,5,4,5,5);
        StudentTabel student2 = new StudentTabel("Petrov Petr",
                                              "4A",
                                                          student2Subject1,
                                                          student2Subject2,
                                                          student2Subject3);

        System.out.println(student1.sOut());
        System.out.println(student2.sOut());

    }
}
