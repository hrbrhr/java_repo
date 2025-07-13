package org.javaguru.student_evgeniy_shendelev.lesson_5.level_3;

class TaxDemo {
    public static void main(String[] args) {
        Tax tax = new Tax();
        for (double i = 5000.0; i < 55_000.0; i += 1005.4) {
            System.out.printf("For %.02f tax is %.02f%n", i, tax.tax(i));
        }
    }
}
