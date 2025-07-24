package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_5_middle;

import java.util.Arrays;

class SalesAnalyzer {
    //- какой из товаров самый продаваемый (по количеству проданных единиц);
//- какой товар приносит самый большой оборот (по сумме продаж).
    public static void main(String[] args) {
        SalesAnalyzer analyzer = new SalesAnalyzer();
        Sale[] sales = {
                new Sale("Product A", 10.0, 10),
                new Sale("Product B", 5.0, 5),
                new Sale("Product B", 50.0, 5),
                new Sale("Product A", 20.0, 5),
                new Sale("Product C", 15.0, 5),
                new Sale("Product B", 8.0, 5)
        };
        System.out.println("Best sale by Qty: " + analyzer.bestSaleByQty(sales));
        System.out.println("Best sale by Total: " + analyzer.bestSaleByTotal(sales));
    }

    public String bestSaleByQty(Sale[] sales) {
        if ((sales == null) || (sales.length == 0)) return "";
        Sale bestSale = sales[0];
        int  bestSaleQty = findTotalQtyForProduct(bestSale.getProduct(), sales);
        for (Sale sale : sales) {
            int saleQty = findTotalQtyForProduct(sale.getProduct(), sales);
            if (saleQty > bestSaleQty) {
                bestSale = sale;
            }
        }
        return bestSale.getProduct();
    }

    public String bestSaleByTotal(Sale[] sales) {
        Sale bestSale = sales[0];
        double  bestSaleTotalPrice = findTotalPriceForProduct(bestSale.getProduct(), sales);
        for (Sale sale : sales) {
            double saleQty = findTotalPriceForProduct(sale.getProduct(), sales);
            if (saleQty > bestSaleTotalPrice) {
                bestSale = sale;
            }
        }
        return bestSale.getProduct();
    }

    private double findTotalPriceForProduct(String product, Sale[] sales) {
        return Arrays.stream(findAllSalesByProduct(product, sales))
                .map(sale -> sale.getPricePerUnit() * sale.getUnitCount())
                .reduce(0.0, Double::sum);
    }

    public int findTotalQtyForProduct(String product, Sale[] sales) {
        return Arrays.stream(findAllSalesByProduct(product, sales))
                .map(Sale::getUnitCount)
                .reduce(0, Integer::sum);
    }

    public Sale[] findAllSalesByProduct(String product, Sale[] sales) {
        return Arrays.stream(sales)
                .filter((sale -> sale.getProduct().equals(product)))
                .toArray(Sale[]::new);
    }

}
