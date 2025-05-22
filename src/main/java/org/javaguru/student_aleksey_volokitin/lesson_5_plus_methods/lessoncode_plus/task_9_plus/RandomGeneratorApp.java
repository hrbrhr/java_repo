package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_9_plus;

class RandomGeneratorApp {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        int minNumber = 10;
        int maxNumber = 20;

        int randomNumber = randomGenerator.generateRandomNumber(minNumber, maxNumber);
        System.out.println(randomNumber);

        double randomDoubleNumber = randomGenerator.generateRandomDoubleNumber(minNumber, maxNumber);
        System.out.println(randomDoubleNumber);
    }
}
