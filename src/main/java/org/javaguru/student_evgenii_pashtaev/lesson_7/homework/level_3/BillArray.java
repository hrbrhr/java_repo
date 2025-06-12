package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_3;

class BillArray {
    Bill[] arrayObjects = new Bill[5];


    public int getMiddleBill(){
        Bill[] array = this.arrayObjects;
        int sumBill = 0;
        for (int i = 0; i < array.length; i++){
            sumBill += array[i].sum;
        }
        int middleBill = sumBill / array.length;
        return middleBill;
    }
}
