package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_6_middle;

class SchoolReportCardApp {
    public static void main(String[] args) {
        SchoolReportCardCalculate schoolReportCardCalculate = new SchoolReportCardCalculate();

        SchoolReportCard student1 = new SchoolReportCard(5, 4, 5, 4, 4);
        System.out.println("Средний балл: " + schoolReportCardCalculate.schoolReportCard(student1));

        SchoolReportCard student2 = new SchoolReportCard(3, 5, 3, 4, 3);
        System.out.println("Средний балл: " + schoolReportCardCalculate.schoolReportCard(student2));

        SchoolReportCard student3 = new SchoolReportCard(5, 5, 5, 5, 5);
        System.out.println("Средний балл: " + schoolReportCardCalculate.schoolReportCard(student3));
    }
}
