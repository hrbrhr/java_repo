package org.javaguru.student_anastassija.lesson_4.level_4;

class StockShares {

    private String companyName;
    private int sharePrice;
    private int minimumPrice;
    private int maximunmPrice;

    public StockShares(String companyName, int sharePrice){
        this.companyName = companyName;
        this.sharePrice = sharePrice;
        this.minimumPrice = sharePrice;
        this.maximunmPrice = sharePrice;
    }

    public void upPrice(int newPrice) {
        this.sharePrice = newPrice;
        if (this.minimumPrice > newPrice) {
            this.minimumPrice = newPrice;
        }
        if (this.maximunmPrice < newPrice) {
            this.maximunmPrice = newPrice;
        }
    }
    String getCompanyName(){ return this.companyName;}
    int getSharePrice(){return this.sharePrice;}
    int getMinimumPrice(){return this.minimumPrice;}
    int getMaximumPrice(){return this.maximunmPrice;}
}
