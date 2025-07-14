package org.javaguru.student_evgeniy_shendelev.lesson_5.level_6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassRoomRates {

    private final Map<String, ReportCard> reportCardMap = new HashMap<>();

    //При создании примем, что тезок не существует. Для тезок необходим генератор ID
    public void createReportCard(String name) {
       if (!reportCardMap.containsKey(name)) {
           ReportCard reportCard = new ReportCard(name);
           reportCardMap.put(name, reportCard);
       } else {
           System.out.println("Человек с таким именем уже существует");
       }
    }

    public double avgRate(ReportCard reportCard) {
        List<Integer> table = reportCard.getTable();
        return table.stream().mapToDouble(Integer::intValue).sum() / table.size();
    }

    public void addRate(ReportCard reportCard, int rate) {
        if (reportCard == null) {
            System.out.println("Report card is null");
        }
        if (rate > 0 && rate < 6) {
            List<Integer> table = reportCard.getTable();
            table.add(rate);
            reportCard.setTable(table);
        } else {
            System.out.println("Оценка должна быть от 1 до 5");
        }
    }

    public Map<String, ReportCard> getReportCardMap() {
        return reportCardMap;
    }
}
