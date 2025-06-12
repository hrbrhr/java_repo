package org.javaguru.student_evgenii_pashtaev.lesson_5.level_7.v2;

public class TemperetureApplication {

    public static void main(String[] args) {
        Tempereture temp1 = new Tempereture(40);
        Tempereture temp2 = new Tempereture(50);

        CelciumConverter celciumConverter = new CelciumConverter();
        ForengeitConverter forengeitConverter = new ForengeitConverter();

        System.out.printf("%.2f\n", celciumConverter.convert(temp1));

        System.out.printf("%.2f\n", forengeitConverter.convert(temp2));
    }

}
