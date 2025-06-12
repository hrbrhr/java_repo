package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_3_junior;

class TaxCalculate {
    double taxCalculate (double profit) {
        if ( profit <= 10000) {
            return ( profit * 0.3 );
        } else if ((profit > 10000) && (profit <=50000)) {
            return ( profit * 0.4 );
        } else {
            return (profit * 0.5);
        }
    }
}
