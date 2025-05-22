package org.javaguru.student_evgenii_pashtaev.lesson_5.level_7;
import java.util.Scanner;

public class Tempereture {

    double temperature;

    Tempereture(double temperature){
        this.temperature = temperature;
    }
    double getTempC(){
        double c = (this.temperature - 32) * 5/9;
        return  c;
    }

    double getTempF(){
        double f = (this.temperature * 9/5 ) + 32;
        return  f;
    }
     public static void converter (Tempereture temp){
        Scanner input = new Scanner(System.in);
        System.out.println("Если хотите перевести градусы Цельсия в градусы Фаренгейта нажмите: 1");
        System.out.println("Если хотите перевести градусы Фаренгейта в градусы Цельсия нажмите: 2");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.printf("F = %.2f\n", temp.getTempF());
        }
        if (choice == 2){
            System.out.printf("C = %.2f\n", temp.getTempC());
        }
    }
}
