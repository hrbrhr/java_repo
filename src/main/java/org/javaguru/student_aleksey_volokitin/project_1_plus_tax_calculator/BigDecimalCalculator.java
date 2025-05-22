package org.javaguru.student_aleksey_volokitin.project_1_plus_tax_calculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число: ");
        BigDecimal a = new BigDecimal(scanner.nextLine());

        System.out.print("Введите второе число: ");
        BigDecimal b = new BigDecimal(scanner.nextLine());

        // Ввод операции
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.nextLine();

        BigDecimal result = null;

        // Сравнение чисел
        int compareResult = a.compareTo(b);
        System.out.println("\nРезультат сравнения чисел:");
        switch (compareResult) {
            case -1 -> System.out.println("Первое число больше.\n");
            case 0  -> System.out.println("Числа равны.\n");
            case 1  -> System.out.println("Второе число больше.\n");
            default -> System.out.println("❌ Неизвестный результат!\n");
        }

        // Вичисление результата
        switch (op) {
            case "+":
                result = a.add(b);
                break;
            case "-":
                result = a.subtract(b);
                break;
            case "*":
                result = a.multiply(b);
                break;
            case "/":
                System.out.print("Введите точность (кол-во знаков после запятой): ");
                int scale = Integer.parseInt(scanner.nextLine());
                result = a.divide(b, scale, RoundingMode.HALF_UP);
                break;
            default:
                System.out.println("❌ Неизвестная операция: " + op);
                return;
        }
        System.out.println("✅ Результат: " + result.toPlainString()); // Вывод вещественного числа в безэкспотенциальном виде
    }
}