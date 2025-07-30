package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_7.task_2;

class Division extends TwoArgumentMathOperation {
    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
