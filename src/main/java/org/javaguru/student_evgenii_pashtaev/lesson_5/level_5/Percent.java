package org.javaguru.student_evgenii_pashtaev.lesson_5.level_5;

public class Percent {

    int pv;
    double r;
    int t;

    Percent(int pv, double r, int t){

        this.pv = pv;
        this.r = r;
        this.t = t;
    }

    double getPercent(){

        double percent = this.pv * Math.pow((1 + this.r/100), this.t);
        return percent;
    }
}
