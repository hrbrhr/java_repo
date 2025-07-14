package org.javaguru.student_evgeniy_shendelev.lesson_5.level_6;

class Teacher {
    public static void main(String[] args) {
        ClassRoomRates classRoomRates = new ClassRoomRates();

        classRoomRates.createReportCard("Ivan");
        classRoomRates.createReportCard("Sasha");
        classRoomRates.createReportCard("Masha");

        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 5);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 3);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 1);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 2);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Ivan"), 4);

        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 5);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 5);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 5);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Sasha"), 5);

        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 5);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 3);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 4);
        classRoomRates.addRate(classRoomRates.getReportCardMap().get("Masha"), 3);

        System.out.println("Avg for Masha: " + classRoomRates.avgRate(classRoomRates.getReportCardMap().get("Masha")));
        System.out.println("Avg for Sasha: " + classRoomRates.avgRate(classRoomRates.getReportCardMap().get("Sasha")));
        System.out.println("Avg for Ivan: " + classRoomRates.avgRate(classRoomRates.getReportCardMap().get("Ivan")));
    }
}
