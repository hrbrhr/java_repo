package org.javaguru.student_anastassija.lesson_7.homework.Level_3;
//массив кассовых чеков
class CashReceipt {

    private String number;//номер чека
    private double sum;//сумма покупки

    //объект чека через конструктор
    public CashReceipt(String number, double sum) {
        this.number = number;//Присвой полю number значение, которое пришло в параметре конструктора number
        this.sum = sum;//Присвой полю sum значение, которое пришло в параметре конструктора sum
    }

    public String getNumber() {
        return number;
    }//возвращает номер чека;

    public double getSum() {
        return sum;
    }//возвращает сумму покупки

}
