package org.javaguru.student_anastassija.lesson_4.level_6;

import java.util.Scanner;

class SeasonOfTheYear {
//принимает месяц в виде числа от 1 до 12
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter number from 1 to 12: ");
    int month = scanner.nextInt();

    String season;

    switch (month) {
        case 12:
        case 2:
        case 1:
            season = "Winter";
            break;
        case 3:
        case 4:
        case 5:
            season = "Spring";
            break;
        case 6:
        case 7:
        case 8:
            season = "Summer";
            break;
        case 9:
        case 10:
        case 11:
            season = "Autumn";
            break;
        default:
            season = "Please enter correct number!";
            break;
    }
    System.out.println("Season is: " + season);
    scanner.close();
}
}




    //Программа должна выводить сезон года, которому этот месяц соответствует


