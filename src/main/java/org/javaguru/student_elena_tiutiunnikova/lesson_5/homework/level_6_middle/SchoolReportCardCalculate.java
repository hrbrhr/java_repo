package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_6_middle;

class SchoolReportCardCalculate {

    public double schoolReportCard (SchoolReportCard schoolReportCard) {
        return ((schoolReportCard.getMathScore() + schoolReportCard.getLiteratureScore() + schoolReportCard.getBiologyScore() + schoolReportCard.getChemistryScore() + schoolReportCard.getPhysicScore()) / (double) 5);
    }
}
