package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_4_middle;

class Salary {
//    Вам поручили провести анализ зарплатной ведомости на предприятии.
//    Имеется массив, содержащий зарплату каждого сотрудника компании
//            (пример: {2500.0, 3200.0, 1800.0, 4000.0, 2900.0}).
//
//    Нужно вычислить:
//- общие расходы на зарплаты;
//- минимальную зарплату;
//- максимальную зарплату;
//- среднюю зарплату.
//
//    PS: как дополнительный пункт задания вы можете рассчитать
//    стандартное отклонение (сигма). Вычисление стандартного
//    отклонения позволяет определить, насколько данные
//    в массиве распределены относительно среднего значения.
//    Большое стандартное отклонение указывает на большой разброс данных,
//    а маленькое стандартное отклонение - на маленький разброс.
//
//1. Найдите среднее значение (среднюю арифметическую) массива чисел.
//
//            2. Для каждого числа в массиве вычислите квадрат разности между числом
//    и средним значением.
//
//3. Найдите среднее значение полученных квадратов разностей.
//
//            4. Извлеките квадратный корень из среднего значения,
//    полученного в пункте 3.
//
//    PS: попробуйте узнать как стандартное отклонение (сигма)
//    применяется в анализе данных и статистике.

//    public double[] createSalary (double le)
//
//
//

    public double totalSumSalary (double[] salary) {
        double totalSum = 0.0;
        for (int i = 0; i < salary.length; i++) {
            totalSum += salary[i];
        } return totalSum;
    }

    public double minSalary (double[] salary) {
        if (salary.length == 0) {
            return 0.0;
        } else {
            double minSalary = salary [0];
            for (int i = 0; i < salary.length; i++) {
                if (minSalary > salary[i]) {
                    minSalary = salary[i];
                }
            }
            return minSalary;
        }
    }

    public double maxSalary (double[] salary) {
        if (salary.length == 0) {
            return 0.0;
        } else {
            double maxSalary = salary [0];
            for (int i = 0; i < salary.length; i++) {
                if (maxSalary < salary[i]) {
                    maxSalary = salary[i];
                }
            }
            return maxSalary;
        }
    }

    public double averageSalary (double[] salary) {
        double averageSalary = 0.0;
        for (int i = 0; i < salary.length; i++) {
            averageSalary = totalSumSalary(salary)/salary.length;
        } return averageSalary;
    }

//    public double otklonenieSquared (double [] salary) {
//        double otklonenie = 0.0;
//        for (int i = 0; i < salary.length; i++) {
//            otklonenie = ((salary[i] - averageSalary(salary)) * (salary[i] - averageSalary(salary)));
//        }
//        return otklonenie;
//    }
//
//    public double sigmaSalary (double[] salary) {
//        if (salary.length < 2) {
//            return 0.0;
//        } else {
//            double totalOtklonenie = 0.0;
//            double averageOtklonenie = 0.0;
//            double sigma = 0.0;
//            for (int i = 0; i < salary.length; i++) {
//                totalOtklonenie = totalOtklonenie + otklonenie[i];
//                averageOtklonenie = totalOtklonenie / salary.length;
//                sigma = Math.pow(averageOtklonenie, 2);
//            }
//            return sigma;
//        }
//    }

}
