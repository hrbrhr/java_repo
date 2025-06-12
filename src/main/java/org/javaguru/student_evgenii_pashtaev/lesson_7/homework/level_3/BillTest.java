package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_3;

class BillTest {
    public static void main(String[] args) {

        BillTest test = new BillTest();
        test.testGetMidlleBill();

    }

    public void testGetMidlleBill(){
        int result;
        BillArray arrayBill = new BillArray();

        Bill bill1 = new Bill(1, 300);
        Bill bill2 = new Bill(2, 1000);
        Bill bill3 = new Bill(3, 140);
        Bill bill4 = new Bill(4, 250);
        Bill bill5 = new Bill(5, 400);

        arrayBill.arrayObjects[0] = bill1;
        arrayBill.arrayObjects[1] = bill2;
        arrayBill.arrayObjects[2] = bill3;
        arrayBill.arrayObjects[3] = bill4;
        arrayBill.arrayObjects[4] = bill5;

        result = arrayBill.getMiddleBill();

        if (result == 418){
            System.out.println("OK");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
