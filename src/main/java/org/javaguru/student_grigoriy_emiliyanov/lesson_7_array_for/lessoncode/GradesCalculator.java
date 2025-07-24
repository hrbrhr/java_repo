package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;

import java.util.Arrays;

class GradesCalculator {
    public int findMax(int[] grades) {
        int max = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public int findMin(int[] grades) {
        int min = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public int findSum(int[] grades) {
        return Arrays.stream(grades).sum();
    }

    public double findAverage(int[] grades) {
        return (double)findSum(grades) / grades.length;
    }
}
