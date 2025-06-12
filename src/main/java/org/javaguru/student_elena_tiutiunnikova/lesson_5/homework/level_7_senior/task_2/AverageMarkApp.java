package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_7_senior.task_2;

import java.util.Scanner;

class AverageMarkApp {

    private static int getStudentCountFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());
        return studentCount;
    }

    private static String [] getNameOfStudentFromUser (int studentCount) {
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static double [] getGradeOfStudentFromUser (int studentCount, String [] students) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static double calculateAverageGrade (double [] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);
        return average;
    }

    private static void getStudentsWithGradeUpAverage (int studentCount, double [] grades, double average, String [] students) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    public static void main(String[] args) {

        int studentCount = getStudentCountFromUser();
        String [] students = getNameOfStudentFromUser(studentCount);
        double [] grades = getGradeOfStudentFromUser(studentCount, students);
        double average = calculateAverageGrade(grades, studentCount);
        getStudentsWithGradeUpAverage(studentCount, grades, average, students);
        System.out.println("Программа завершена.");
    }
}