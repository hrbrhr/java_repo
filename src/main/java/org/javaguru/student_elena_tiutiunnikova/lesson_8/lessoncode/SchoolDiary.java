package org.javaguru.student_elena_tiutiunnikova.lesson_8.lessoncode;

import java.util.ArrayList;
import java.util.List;

class SchoolDiary {

    private List<Mark> marks;

    public SchoolDiary() {
        this.marks = new ArrayList<>();
    }

    void addMark(String subject, int markValue) {
        Mark mark = new Mark(subject, markValue);
        marks.add(mark);
    }

// test case 1: subject = Math  mark = 5
// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 5
// test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
// test case 4: {} , "Math" = 0  (? null or 0 or error message)
// test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5

    int findMaxMark(String subject) {
        int maxMark = 0;
//        for (int i = 0; i < marks.size(); i++) {
//            Mark mark = marks.get(i);
//        } ЭТО ТО ЖЕ САМОЕ, ЧТО СТРОКА НИЖЕ
        for (Mark mark : marks) {
            if(mark.getSubject().equals(subject)
                && mark.getMark() > maxMark) {
                maxMark = mark.getMark();
            }
        }
        return maxMark;
    }

// test case 1: subject = Math  mark = 5
// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} , "Math" = 4
// test case 3: {subject = "Math", mark = 5}, {subject = "Math", mark = 5} , "Math" = 5
// test case 4: {} , "Math" = 0  (? null or 0 or error message)
// test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10} , "Math" = 5

    int findMinMark(String subject) {
        if (marks.size() == 0) {
            return 0;
        } else {
        int minMark = marks.get(0).getMark();
            for (Mark mark : marks) {
                if(mark.getSubject().equals(subject)
                        && mark.getMark() < minMark) {
                    minMark = mark.getMark();
                }
            } return minMark;
        }
    }

// test case 1: subject = Math  mark = 5 -> 5
// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} -> "rez" = 4.5
// test case 3: {} -> 0
// test case 4: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} -> "rez" = 6.333
    double findAverageMark() {
        double totalMarks = 0.0;
        double averageMark = 0.0;
        if (marks.size() == 0) {
            return 0;
        } else {
            for (Mark mark : marks) {
                totalMarks += mark.getMark();
                averageMark = totalMarks / marks.size();
            }
        }
        return averageMark;
    }


// test case 1: subject = Math  mark = 5 -> 5
// test case 2: {subject = "Math", mark = 5}, {subject = "Math", mark = 4} -> "rez" = 4.5
// test case 3: {} -> 0
// test case 4: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} -> "rez" = 4.5
// test case 5: {subject = "Math", mark = 5}, {subject = "Eng", mark = 10}, {subject = "Math", mark = 4} Bio?-> "rez" = 0
    double findAverageMarkForTheSubject(String subject) {
        double totalMarks = 0.0;
        int countOfMarks = 0;
        if (marks.size() == 0) {
            return 0;
        } else {
            for (Mark mark : marks) {
                if (mark.getSubject().equals(subject)) {
                    totalMarks += mark.getMark();
                    countOfMarks++;
                }
            }
        } if (countOfMarks == 0) {
            return 0.0;
        } else {
            return totalMarks / countOfMarks;
        }
    }

}
