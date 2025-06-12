package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_5_middle;

class SaleApp {

    private int calculateSaleByCount (Sale[] sales, String product) {
        int saleByCount = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales [i];
            if (product.equals(sale.getProduct())) {
                saleByCount += sale.getUnitCount();
            }
        } return saleByCount;
    }

    private double calculateSaleByPrice (Sale[] sales, String product) {
        double saleByPrice = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales [i];
            if (product.equals(sale.getProduct())) {
                saleByPrice = saleByPrice + (sale.getPricePerUnit() * sale.getUnitCount());
            }
        } return saleByPrice;
    }

    private boolean saleNullOrEmpty (Sale[] sales) {
        return (sales == null) || (sales.length == 0);
    }

    public String findTheMostPopularProductByCount (Sale[] sales) {
        return saleNullOrEmpty(sales) ? null : theMostPopularProductByCount(sales);
    }

    public String findTheMostPopularProductByRevenue (Sale[] sales) {
        return saleNullOrEmpty(sales) ? null : theMostSaleProductByRevenue(sales);
    }

    public String theMostPopularProductByCount (Sale[] sales) {
        String mostPopularProductNameByCount = sales[0].getProduct();
        int maxCountSaleOfProduct = calculateSaleByCount(sales, mostPopularProductNameByCount);

        for (int i = 0; i < sales.length; i++) {
            String currentProductName = sales[i].getProduct();
            int currentProductCount = calculateSaleByCount(sales, currentProductName);

            if (currentProductCount > maxCountSaleOfProduct) {
                mostPopularProductNameByCount = currentProductName;
                maxCountSaleOfProduct = currentProductCount;
            }
        } return mostPopularProductNameByCount;
    }

    public String theMostSaleProductByRevenue (Sale[] sales) {
        String mostSaleProductNameByRevenue = sales[0].getProduct();
        double maxSaleOfProductByRevenue = calculateSaleByPrice(sales, mostSaleProductNameByRevenue);

        for (int i = 0; i < sales.length; i++) {
            String currentProductName = sales[i].getProduct();
            double currentProductSales = calculateSaleByPrice(sales, currentProductName);

            if (currentProductSales > maxSaleOfProductByRevenue) {
                mostSaleProductNameByRevenue = currentProductName;
                maxSaleOfProductByRevenue = currentProductSales;
            }
        } return mostSaleProductNameByRevenue;
    }

}
