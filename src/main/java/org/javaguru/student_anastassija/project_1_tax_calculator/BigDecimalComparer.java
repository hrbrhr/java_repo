package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;
import java.util.Scanner;

class BigDecimalComparer{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений
        System.out.print("Введите первое число (a): ");
        String inputA = scanner.nextLine();
        BigDecimal a = new BigDecimal(inputA);

        System.out.print("Введите второе число (b): ");
        String inputB = scanner.nextLine();
        BigDecimal b = new BigDecimal(inputB);

        // Сравнение
        System.out.println("\n📊 Результаты сравнения:");
        System.out.println("a = " + a.toPlainString());
        System.out.println("b = " + b.toPlainString());

        // compareTo
        int cmp = a.compareTo(b);
        if (cmp < 0) {
            System.out.println("🔸 a < b (по значению)");
        } else if (cmp > 0) {
            System.out.println("🔸 a > b (по значению)");
        } else {
            System.out.println("🔸 a == b (по значению)");
        }

        // equals
        if (a.equals(b)) {
            System.out.println("✅ a.equals(b) → true (и значение, и масштаб совпадают)");
        } else {
            System.out.println("❌ a.equals(b) → false (масштаб или значение отличаются)");
        }
    }
}
