package org.javaguru.student_evgeniy_shendelev.lesson_5.level_5;

class CompoundInterestDemo {
    public static void main(String[] args) {
        CompoundInterest ci = new CompoundInterest();
        System.out.printf("Вклад 1000р на 10 лет, с процентной ставкой 11%%. Итог: %.02f%n", ci.calculate(1000,
                0.11, 10));
        System.out.printf("Вклад 15000р на 2 года, с процентной ставкой 5%%. Итог: %.02f%n", ci.calculate(15000,
                0.05, 2));
    }

}
