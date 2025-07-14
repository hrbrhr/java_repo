package org.javaguru.student_evgeniy_shendelev.lesson_5.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {

        String[] students = createStudentList();
        double[] grades = makeGrades(students,students.length);


        double average = average(grades, students.length);

        System.out.println("Средний балл: " + average);


        whoGreaterAverage(students, grades, average);


        System.out.println("Программа завершена.");
    }

    static double average(double[] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;
    }

    static String[] createStudentList() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());
        String[] students = new String[studentCount];


        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }

        return students;
    }

    static double[] makeGrades(String[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }

        return grades;
    }

    static void whoGreaterAverage(String[] students, double[] grades, double average) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < students.length; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

}

