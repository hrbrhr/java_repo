package org.javaguru.student_evgenii_pashtaev.lesson_5.level_6;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Tabel {

    int assessment1;
    int assessment2;
    int assessment3;
    int assessment4;

    Tabel(int assessment1, int assessment2, int assessment3, int assessment4){

        this.assessment4 = assessment4;
        this.assessment3 = assessment3;
        this.assessment2 = assessment2;
        this.assessment1 = assessment1;
    }

    double getMiddle(){

        return (double) (this.assessment1 + this.assessment2 + this.assessment3 + this.assessment4) / 4;
    }
}
