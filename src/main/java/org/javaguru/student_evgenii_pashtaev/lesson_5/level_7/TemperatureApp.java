package org.javaguru.student_evgenii_pashtaev.lesson_5.level_7;

public class TemperatureApp {
    public static void main(String[] args) {

        Tempereture temp = new Tempereture(40);
        System.out.printf("%.2f\n", temp.getTempF());

        Tempereture tempTwo = new Tempereture(300);
        System.out.printf("%.2f\n", tempTwo.getTempC());

        Tempereture.converter(tempTwo);
    }

}
