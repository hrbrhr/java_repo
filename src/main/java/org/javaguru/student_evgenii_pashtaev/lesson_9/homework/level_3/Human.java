package org.javaguru.student_evgenii_pashtaev.lesson_9.homework.level_3;

class Human extends LoanSystem{
    @Override
    boolean canReceiveLoan(Human human) {
        return false;
    }
}
