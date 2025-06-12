package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_5;

public class SaleApp {

    public static void main(String[] args) {
        Sale socks = new Sale("Socks", 100, 200);
        Sale shirts = new Sale("Shirts", 300, 100);
        Sale boots = new Sale("Boots", 500, 40);
        Sale waist = new Sale("Waist", 200, 80);

        Sale[] arraySale = {socks, shirts, boots, waist};
        int maxSaleCount = arraySale[0].getUnitCount();
        double maxSaleMoney = arraySale[0].getUnitCount() * arraySale[0].getPricePerUnit();
        String nameSaleCount = arraySale[0].getProduct();
        String nameSaleMoney = arraySale[0].getProduct();

        for (int i = 0; i < arraySale.length; i++){
            if (maxSaleCount < arraySale[i].getUnitCount()){
                nameSaleCount = arraySale[i].getProduct();
            }

            double saleMoney_I = arraySale[i].getUnitCount() * arraySale[i].getPricePerUnit();
            if (maxSaleMoney < saleMoney_I){
                nameSaleMoney = arraySale[i].getProduct();
            }

        }
        System.out.println("Maximum per unit = " + nameSaleCount);
        System.out.println("Maximum money per product = " + nameSaleMoney);

    }
}
