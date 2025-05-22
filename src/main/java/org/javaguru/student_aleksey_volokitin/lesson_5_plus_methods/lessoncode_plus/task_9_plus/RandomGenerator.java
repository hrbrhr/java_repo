package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_9_plus;

import java.util.Random;

class RandomGenerator {
    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public double generateRandomDoubleNumber(int min, int max) {
        Random random = new Random();
        return random.nextDouble() * (max - min) + min;
    }
}
