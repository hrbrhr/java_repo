package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_4_plus;

class SalaryCalculatorApp {
    public static void main(String[] args) {
        Person persons[] = {new Person("Ivanov", "Ivan", 1540.0),
                            new Person("Petrov", "Petr", 1630.52),
                            new Person("Sergeev", "Sergej", 1360.0),
                            new Person("Dmitriev", "Dmitrij", 2000.0),
                            new Person("Romanov", "Roman", 1780.0)};

//        Person persons[] = {};

//        Person persons[] = {new Person("Ivanov", "Ivan", 1540.0),
//                            new Person("Romanov", "Petr", 1780.0)};

        SalaryCalculator calculator = new SalaryCalculator();
        double total = calculator.calculateTotalSalarySum(persons);
        double min = calculator.calculateMinSalarySum(persons);
        double max = calculator.calculateMaxSalarySum(persons);
        double average = calculator.calculateAverageSalarySum(persons);
        double sigma = calculator.calculateSigmaSalarySum(persons);

        System.out.println("Total salary: " + total);
        System.out.println("Min salary: " + min);
        System.out.println("Max salary: " + max);
        System.out.println("Average salary: " + average);
        System.out.println("Sigma: " + sigma);
    }
}
