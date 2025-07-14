package org.javaguru.student_evgeniy_shendelev.lesson_5.level_7.task_3;

import java.util.Scanner;

class StockApp {
    public static void main(String[] args) {
        Stock stock = createStock();
        setPrice(stock);

        System.out.println("Максимальная цена акции " + stock.getName() + ": " + stock.getMaxPrice());
        System.out.println("Минимальная цена акции " + stock.getName() + ": " + stock.getMinPrice());
        System.out.println("Средняя цена акции " + stock.getName() + ": " + stock.getAvgPrice());

        System.out.println("Программа завершена.");
    }

    static Stock createStock() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название акции: ");
        String stockName = scanner.nextLine();

        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());
        return new Stock(stockName, stockPriceCount);
    }

    static void setPrice(Stock stock) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < stock.getPrices().length; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            stock.setCurrentPrice(Double.parseDouble(scanner.nextLine()), i);
        }
    }
}
