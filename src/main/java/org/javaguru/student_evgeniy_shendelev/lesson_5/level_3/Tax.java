package org.javaguru.student_evgeniy_shendelev.lesson_5.level_3;

class Tax {
    double tax(double sum) {
        if (sum < 10_000.0) {
            return sum * 0.30;
        }
        if (sum >= 10_000.0 && sum < 50_000.0) {
            return sum * 0.40;
        }
        return sum * 0.50;
    }
}
