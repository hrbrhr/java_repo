package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_4;

 class Stock {
    private String company;
    private int current;
    private int min;
    private int max;


    public Stock(String company, int initialPrice) {
        this.company = company;
        this.current = initialPrice;
        this.min = initialPrice;
        this.max = initialPrice;
    }
     public void updatePrice(int newPrice) {
         current = newPrice;

         if (newPrice < min) {
             min = newPrice;
         }

         if (newPrice > max) {
             max = newPrice;
         }
     }
     public String getCompany() {
         return company;
     }

     public int getCurrent() {
         return current;
     }

     public int getMin() {
         return min;
     }

     public int getMax() {
         return max;
     }




}
