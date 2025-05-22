package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_3_plus;

class Tax {
    double calculateTax(double amount) {
        if (amount < 10000) {
            return Math.ceil(amount * 0.3d * 100) / 100;
        }
        else if ((amount >= 10000) && (amount < 50000)) {
            return Math.ceil(amount * 0.4d * 100) / 100;
        }
        else {
            return Math.ceil(amount * 0.5d * 100) / 100;
        }
    }
}
