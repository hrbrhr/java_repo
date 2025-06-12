package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_7_senior.task_3;

import java.util.Scanner;

public class StockApp {

    public static void main(String[] args) {
        String nameOfStock = getNameOfStockFromUser();
        int stockPriceCount = getCountOfStockFromUser();
        double[] prices = getPriceOfStockFromUser(stockPriceCount);
        double maxPrice = findMaxPriceOfStock(prices, nameOfStock);
        double minPrice = findMinPriceOfStock(prices, nameOfStock);
        double averagePrice = findAveragePriceOfStock(prices, nameOfStock);
        System.out.println("Программа завершена.");
    }

    private static String getNameOfStockFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

    private static int getCountOfStockFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static double[] getPriceOfStockFromUser (int stockPriceCount) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        } return prices;
    }

    private static double findMaxPriceOfStock (double[] prices, String stockName) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);
        return maxPrice;
    }

    private static double findMinPriceOfStock (double[] prices, String stockName) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);
        return minPrice;
    }

    private static double findAveragePriceOfStock (double[] prices, String stockName) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);
        return averagePrice;
    }
}

