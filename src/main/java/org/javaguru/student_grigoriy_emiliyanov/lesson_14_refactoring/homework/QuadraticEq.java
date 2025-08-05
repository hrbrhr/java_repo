package org.javaguru.student_grigoriy_emiliyanov.lesson_14_refactoring.homework;

class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = getDiscriminant(a, b, c);
        if (discriminant > 0) {
            return getBothRoots(a, b, discriminant);
        } else if (discriminant == 0) {
            return getRoot(a, b);
        } else {
            return getNoRootMessage();
        }
    }

    private String getNoRootMessage() {
        return "Equation has no roots";
    }

    private String getRoot(double a, double b) {
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    private String getBothRoots(double a, double b, double discriminant) {
        double x1, x2;
        x1 = getX1(a, b, discriminant);
        x2 = getX2(a, b, discriminant);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private static double getX2(double a, double b, double discriminant) {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    private static double getX1(double a, double b, double discriminant) {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    private static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

}
