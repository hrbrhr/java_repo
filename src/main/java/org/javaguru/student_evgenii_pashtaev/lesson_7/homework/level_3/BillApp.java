package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_3;

class BillApp {

    public static void main(String[] args) {
        Bill bill1 = new Bill(1, 300);
        Bill bill2 = new Bill(2, 1000);
        Bill bill3 = new Bill(3, 140);
        Bill bill4 = new Bill(4, 250);
        Bill bill5 = new Bill(5, 400);

        BillArray array = new BillArray();
        array.arrayObjects[0] = bill1;
        array.arrayObjects[1] = bill2;
        array.arrayObjects[2] = bill3;
        array.arrayObjects[3] = bill4;
        array.arrayObjects[4] = bill5;

        int result = array.getMiddleBill();

        System.out.println(result);

    }

}
