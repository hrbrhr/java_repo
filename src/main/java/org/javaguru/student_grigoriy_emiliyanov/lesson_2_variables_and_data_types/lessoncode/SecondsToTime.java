package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Перевод времени":
//        Напишите программу, которая запрашивает
//        у пользователя количество секунд и выводит
//        время в формате часы:минуты:секунды.
//        Например, если пользователь вводит 3665 секунд,
//        программа должна вывести 1:1:5.
class SecondsToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds:");
        int inputSeconds = scanner.nextInt();
        int hours = inputSeconds / 3600;
        int min = (inputSeconds % 3600) / 60;
        int sec = (inputSeconds % 3600) % 60;
        String time = hours + ":" + min + ":" + sec;
        System.out.println("Your time is: " + time);
    }
}
