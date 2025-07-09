package org.javaguru.student_evgeniy_shendelev.lesson_2.homework.level_2.task_2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут? Напиши и нажми Enter");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }


}
