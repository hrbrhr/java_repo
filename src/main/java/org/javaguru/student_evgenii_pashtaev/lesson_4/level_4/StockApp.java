package org.javaguru.student_evgenii_pashtaev.lesson_4.level_4;

public class StockApp {
    public static void main(String[] args) {

        Stock st = new Stock("Best", 100);
        st.updatePrice(300);
        st.updatePrice(3);
        st.updatePrice(44);
        System.out.println("Current price " + st.getCostNow());
        System.out.println("Maximum price " + st.getCostMax());
        System.out.println("Minimum price " + st.getCostMin());
        System.out.println("Minimum price " + st.getCostMinTwo());
        System.out.println("Maximum price " + st.getCostMaxTwo());
    }
}
