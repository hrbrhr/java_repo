package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_6_middle;

class SchoolReportCard {

    private int mathScore;
    private int literatureScore;
    private int physicScore;
    private int biologyScore;
    private int chemistryScore;

    public SchoolReportCard (int mathScore, int literatureScore, int physicScore, int biologyScore, int chemistryScore) {
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.physicScore = physicScore;
        this.biologyScore = biologyScore;
        this.chemistryScore = chemistryScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getLiteratureScore() {
        return literatureScore;
    }

    public int getPhysicScore() {
        return physicScore;
    }

    public int getBiologyScore() {
        return biologyScore;
    }

    public int getChemistryScore() {
        return chemistryScore;
    }

}
