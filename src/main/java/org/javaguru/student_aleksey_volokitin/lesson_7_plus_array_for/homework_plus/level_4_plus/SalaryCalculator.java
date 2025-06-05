package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_4_plus;

class SalaryCalculator {
    // вычисление общих расходов на зарплату
    double calculateTotalSalarySum(Person persons[]) {
        double totalSum = 0.0d;
        for (Person person: persons) {
            totalSum += person.getSalary();
        }
        return totalSum;
    }

    // вычисление минимального размера зарплаты
    double calculateMinSalarySum(Person persons[]) {
        double minSum = Double.MAX_VALUE;
        for (Person person: persons) {
            if (person.getSalary() < minSum) {
                minSum = person.getSalary();
            }
        }
        if (minSum < Double.MAX_VALUE) {
            return minSum;
        }
        else {
            return 0.0d;
        }
    }

    // вычисление максимального размера зарплаты
    double calculateMaxSalarySum(Person persons[]) {
        double maxSum = Double.MIN_VALUE;
        for (Person person: persons) {
            if (person.getSalary() > maxSum) {
                maxSum = person.getSalary();
            }
        }
        if (maxSum > Double.MIN_VALUE) {
            return maxSum;
        }
        else {
            return 0.0d;
        }
    }

    // вычисление среднего размера зарплаты
    double calculateAverageSalarySum(Person persons[]) {
        double totalSum = calculateTotalSalarySum(persons);
        double averageSum = 0.0d;
        if (persons.length > 0) {
            averageSum = totalSum / persons.length;
        }
        return averageSum;
    }

    // вычисление стандартного отклонения
    double calculateSigmaSalarySum(Person persons[]) {
        double averageSum = calculateAverageSalarySum(persons);
        double squareDifferenceOfSalaryAndAverageSum[] = new double[persons.length];
        int i = 0;
        double salary;
        double squareDifference;
        // вычисление квадрата разности между числом и средним значением и запись их в массив
        for (Person person: persons) {
            salary = person.getSalary();
            squareDifference = (averageSum - salary) * (averageSum - salary);
            squareDifferenceOfSalaryAndAverageSum[i] = squareDifference;
            i += 1;
        }
        // вычисление среднего значения полученных квадратов разностей
        double averageSquareDifference = 0.0d;
        for (int j = 0; j < squareDifferenceOfSalaryAndAverageSum.length; j++) {
            averageSquareDifference += squareDifferenceOfSalaryAndAverageSum[j];
        }
        double sigmaSalarySum = 0.0d;
        if (squareDifferenceOfSalaryAndAverageSum.length > 0) {
            sigmaSalarySum = Math.sqrt(averageSquareDifference / squareDifferenceOfSalaryAndAverageSum.length);
        }
        //
        return sigmaSalarySum;
    }
}
