package org.javaguru.student_anastassija.lesson_7.homework.Level_3;

class CashReceiptCalculator {

    public double calculateTotalSum(CashReceipt[] receipts) {//Принимает массив объектов CashReceipt
        double totalSum = 0.0; // переменная, в ней будет накапливаться итоговая сумма
        //Пробегаемся по всем чекам в массиве.
        //У каждого чека вызываем метод getSum() — получаем его сумму.
        //Прибавляем эту сумму к общей (totalSum).
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            totalSum += receipt.getSum();
        }
        return totalSum;//Метод возвращает итоговую сумму всех чеков.
    }

    public double calculateAverageSum(CashReceipt[] receipts) {//Принимает массив объектов CashReceipt
        if (receipts.length == 0) {
            return 0.0;//Если чека нет (массив пустой), возвращаем 0.0, чтобы избежать деления на ноль.
        } else {
            double totalSum = calculateTotalSum(receipts);//Возвращает результат типа double — среднюю сумму
            return totalSum / receipts.length;//Затем делим эту сумму на количество чеков, чтобы получить среднюю сумму одного чека.
        }
    }
}
