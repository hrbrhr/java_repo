package org.javaguru.student_evgenii_pashtaev.lesson_4.level_4;

import java.util.ArrayList;

public class StockApp {
    public static void main(String[] args) {

        Stock st = new Stock("Best", 100);
        st.updatePrice(300);
        st.updatePrice(3);
        st.updatePrice(44);
        System.out.println(st.getCostNow());
        System.out.println(st.getCostMax());
        System.out.println(st.getCostMin());
        System.out.println(st.getCostMinTwo());
        System.out.println(st.getCostMaxTwo());
    }
}
