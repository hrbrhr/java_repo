package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_7_senior;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = getStudentCount(scanner);

        String[] students = getStudents(studentCount, scanner);

        double[] grades = getGrades(studentCount, students, scanner);

        double average = getAverage(grades, studentCount);
        
        System.out.println("Средний балл: " + average);

        printStudentsAboveAverage(studentCount, grades, average, students);

        System.out.println("Программа завершена.");
    }

    private static void printStudentsAboveAverage(int studentCount, double[] grades, double average, String[] students) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private static double getAverage(double[] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / studentCount;
    }

    private static double[] getGrades(int studentCount, String[] students, Scanner scanner) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static String[] getStudents(int studentCount, Scanner scanner) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static int getStudentCount(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

}
