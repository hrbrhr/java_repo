package org.javaguru.student_evgeniy_shendelev.lesson_5.level_6;

import java.util.ArrayList;
import java.util.List;

class ReportCard {
    private String name;
    private List<Integer> table = new ArrayList<>();

    public ReportCard(String name) {
        this.name = name;
    }

    public List<Integer> getTable() {
        return table;
    }

    public void setTable(List<Integer> table) {
        this.table = table;
    }
}



