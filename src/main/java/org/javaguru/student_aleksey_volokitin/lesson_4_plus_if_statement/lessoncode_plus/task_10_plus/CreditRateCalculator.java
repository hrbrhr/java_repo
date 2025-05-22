package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_10_plus;

import java.util.Locale;
import java.util.Scanner;

class CreditRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter credit grade : ");
        int creditGrade = scanner.nextInt();
        String rate = "";

        if (isCreditGradeOver700(creditGrade))          { rate = "5%"; }
        if (isCreditGradeBetween650And700(creditGrade)) { rate = "7%"; }
        if (isCreditGradeUnder650(creditGrade))         { rate = "10%"; }
        System.out.println(rate);
    }

    private static boolean isCreditGradeOver700(int creditGrade) {
        return creditGrade > 700;
    }

    private static boolean isCreditGradeBetween650And700(int creditGrade) {
        return (creditGrade >= 650) && (creditGrade <= 700);
    }

    private static boolean isCreditGradeUnder650(int creditGrade) {
        return creditGrade < 650;
    }

}
