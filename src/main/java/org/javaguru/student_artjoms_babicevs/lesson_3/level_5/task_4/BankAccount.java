package org.javaguru.student_artjoms_babicevs.lesson_3.level_5.task_4;


    class BankAccount {

        private String ownerFirstName;
        private String ownerLastName;
        private int moneyAmount;

        BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        String getOwnerFirstName() {
            return this.ownerFirstName;
        }

        String getOwnerLastName() {
            return this.ownerLastName;
        }

        int getMoneyAmount() {
            return this.moneyAmount;
        }


    }





