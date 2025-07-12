package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_4;

class StockDemo {
    public static void main(String[] args) {
        Stock company = new Stock("Company", 1000);
        System.out.println(company);
        company.updatePrice(1020);
        System.out.println(company);
        company.updatePrice(999);
        System.out.println(company);
        company.updatePrice(1432);
        System.out.println(company);
        company.updatePrice(365);
        System.out.println(company);
    }



}
