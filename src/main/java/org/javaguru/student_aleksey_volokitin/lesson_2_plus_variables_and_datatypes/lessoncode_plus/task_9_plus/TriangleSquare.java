package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_9_plus;

class TriangleSquare {
    public static void main(String[] args) {
        // S = sqrt(p * (p - a) * (p - b) * (p - c))
        // p = (a + b + c) / 2
        int side1 = 6;
        int side2 = 5;
        int side3 = 2;

        double p = (side1 + side2 + side3) / 2.0d;
        System.out.println(p);
        double triangleSquare = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("Triangle square: " + triangleSquare);
        double roundingTriangleSquare = Math.round(triangleSquare * 100) / 100.0d;
        System.out.println("Triangle square: " + roundingTriangleSquare);
    }
}
