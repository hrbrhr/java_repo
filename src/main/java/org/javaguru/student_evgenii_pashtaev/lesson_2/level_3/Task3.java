package org.javaguru.student_evgenii_pashtaev.lesson_2.level_3;
import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();
        double result = (double) (a + b + c) / 3;
        System.out.println(result);
    }
}
