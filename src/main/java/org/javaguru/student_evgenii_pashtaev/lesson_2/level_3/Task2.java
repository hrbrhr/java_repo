package org.javaguru.student_evgenii_pashtaev.lesson_2.level_3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double p, s;
        p = 2 * Math.PI * r;
        s = Math.PI * Math.pow (r, 2);
        System.out.printf("Perimeter is %.14f\nArea is %.14f", p , s);
    }
}
