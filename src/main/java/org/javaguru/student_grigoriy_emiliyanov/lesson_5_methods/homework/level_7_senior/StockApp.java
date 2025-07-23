package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_7_senior;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stockName = getStockName(scanner);

        int stockPriceCount = getStockPriceCount(scanner);

        double[] prices = getPrices(stockPriceCount, scanner);

        double maxPrice = getMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = getMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        double averagePrice = getAveragePrice(prices);
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

    private static double getAveragePrice(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / prices.length;
    }

    private static double getMinPrice(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    private static double getMaxPrice(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    private static double[] getPrices(int stockPriceCount, Scanner scanner) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    private static int getStockPriceCount(Scanner scanner) {
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String getStockName(Scanner scanner) {
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

}
