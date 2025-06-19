package org.javaguru.student_alexey_yakovlev.lesson_8.lessoncode;

import java.util.ArrayList;
import java.util.List;

class SchoolDairy {

    private List<Mark> marks;

    public SchoolDairy() {
        this.marks = new ArrayList<>();
    }

    void addMark(String subject, int markValue) {
        Mark mark = new Mark(subject, markValue);
        marks.add(mark);
    }

    // test case1: {subject = "Math", mark = 5}, "Math" = 5
    // test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 5
    // test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
    // test case 4: {} , "Math" = 0  (? null or 0 or error message)
    // test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5


    int findMaxMark(String subject) {
        int maxMark = 0;
//        for (int i = 0; i < marks.size(); i++) {
//            Mark mark = marks.get(i);
//        }
        for (Mark mark : marks) {
            if (mark.getSubject().equals(subject) && mark.getMark() > maxMark) {
                maxMark = mark.getMark();
            }
        }
        return maxMark;
    }


    // test case1: {subject = "Biology", mark = 5}, "Biology" = 5
    // test case 2: {subject = "Biology", mark = 5}, {subject = "Biology", mark = 4} , "Biology" = 4
    // test case 3: {subject = "Biology", mark = 5}, {subject = "Biology", mark = 5} , "Biology" = 5
    // test case 4: {} , "Biology" = 0  (? null or 0 or error message)
    // test case 5: {subject = "Biology", mark = 5}, {subject = "Eng", mark = 10} , "Biology" = 5

    int findMinMark(String subject) {
        int minMark = 10;
        for (Mark mark : marks) {
            if (mark.getSubject().equals(subject) && mark.getMark() < minMark) {
                minMark = mark.getMark();
            }
        }
        return minMark;
    }


    // test case1: {subject = "Math", mark = 5}, "Math" = 5
    // test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 4,5
    // test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
    // test case 4: {} , "Math" = 0  (? null or 0 or error message)
    // test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5

    double findAvgMark(String subject) {
        double avgMark;
        double sum = 0;
        int count = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().equals(subject)) {
                sum += mark.getMark();
                count++;
            }
        }
        avgMark = sum / count;
        return avgMark;
    }


    // test case1: {subject = "Math", mark = 5}, "Math" = 5
    // test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 4,5
    // test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
    // test case 4: {} , "Math" = 0  (? null or 0 or error message)
    // test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 7,5

    double findTotalAvgMark() {
        double totalAvgMark;
        double sum = 0;
        int count = 0;
        for (Mark mark : marks) {
            sum += mark.getMark();
            count++;
        }
        totalAvgMark = sum / count;
        return totalAvgMark;
    }
}
