package org.javaguru.student_evgenii_pashtaev.lesson_4.level_4;

import java.util.ArrayList;
import java.util.Collections;

class Stock {
    ArrayList<Integer> array = new ArrayList<>();
    String companyName;
    int costNow;
    int costMin;
    int costMax;
    int count = 0;
    Stock(String companyName, int costNow){
        this.companyName = companyName;
        this.costNow = costNow;
    }
    void updatePrice(int newPrice){
        array.add(newPrice);
        this.costNow = newPrice;
    }
    int getCostMin(){
        Collections.sort(array);
        costMin =  array.getFirst();
        return costMin;
    }
    int getCostMax(){
        Collections.sort(array);
        costMax = array.getLast();
        return costMax;
    }
    int getCostNow(){
        return this.costNow;
    }
    void updatePriceTwo(int newPrice){

        if (count == 0) {
            costMin = newPrice;
            costMax = newPrice;
        }
        if (newPrice < costMin){
            costMin = newPrice;
        }
        if (newPrice > costMax){
            costMax = newPrice;
        }
        count++;
        this.costNow = newPrice;
    }
    int getCostMinTwo(){
        return this.costMin;
    }
    int getCostMaxTwo(){
        return this.costMax;
    }
}
