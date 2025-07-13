package org.javaguru.student_evgeniy_shendelev.lesson_5.level_4;

public class CircleCalcDemo {
    public static void main(String[] args) {
        CircleCalc circleCalc = new CircleCalc();
        for (double i = 1.0; i < 10.0; i += 0.3) {
            System.out.printf("for radius %.02f area = %.02f, perimeter = %.02f\n", i, circleCalc.area(i),
                    circleCalc.perimeter(i));
        }
    }
}
