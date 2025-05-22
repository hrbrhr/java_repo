package org.javaguru.student_evgenii_pashtaev.lesson_5.level_3;

class Task1 {
    int money;

    public Task1 (int money){
        this.money = money;
    }
    public static void main(String[] args) {

        Task1 task = new Task1(60000);
        System.out.println(task.choiceTax());
    }
    double choiceTax(){
        if (this.money < 10000){
            return (money * 0.3);
        }
        if (this.money >= 10000 && this.money < 50000){
            return (money * 0.4);
        }
        else {
            return (money * 0.5);
        }
    }
}
