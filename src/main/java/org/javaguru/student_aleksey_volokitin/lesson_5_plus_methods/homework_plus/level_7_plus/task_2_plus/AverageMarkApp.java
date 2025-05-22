package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_7_plus.task_2_plus;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = getStudentCount(scanner);

        String[] students = getStudentName(scanner,studentCount);

        double[] grades = getStudentGrades(scanner,studentCount,students);

        double average = findAverageStudentGrades(grades, studentCount);
        System.out.println("Средний балл: " + average);

        findStudentsWithAboveAverageGPA(studentCount,students,grades,average);

        theEnd();
    }

    private static int getStudentCount (Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String[] getStudentName(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static double[] getStudentGrades(Scanner scanner, int studentCount, String students[]) {
        double[] grades = new double[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static double findAverageStudentGrades(double[] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;
    }

    private static void findStudentsWithAboveAverageGPA(int studentCount, String[] students, double[] grades, double average) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private static void theEnd() {
        System.out.println("Программа завершена.");
    }
}
