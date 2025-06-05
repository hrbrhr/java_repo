package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.lessoncode.task_1_plus;

import java.util.List;

class SchoolDiary {

    int findMaxMarkOfSubject(List<Mark> marks, String subject) {
        int maxMark = 0;

        for (Mark mark: marks) {
            if ((mark.getSubject().equals(subject)) && (mark.getMark() > maxMark)) {
                maxMark = mark.getMark();
            }
        }
        return maxMark;
    }

    int findMinMarkOfSubject(List<Mark> marks, String subject) {
        int minMark = 11;

        for (Mark mark: marks) {
            if ((mark.getSubject().equals(subject)) && (mark.getMark() < minMark)) {
                minMark = mark.getMark();
            }
        }
        if(minMark < 11) { return minMark; }
        else             { return 0; }
    }

    double findAverageMarkOfSubject(List<Mark> marks, String subject) {
        double sumOfMarks = 0.0d;
        double averageMark = 0.0d;
        int countOfMarks = 0;

        for (Mark mark: marks) {
            if (mark.getSubject().equals(subject)) {
                sumOfMarks += mark.getMark() * 1.0d;
                countOfMarks += 1;
            }
        }
        if(countOfMarks > 0) {
            averageMark = sumOfMarks / (countOfMarks * 1.0d);
        }
        return averageMark;
    }

    double findAverageMarkOfAllSubject(List<Mark> marks) {
        double sumOfMarks = 0.0d;
        double averageMark = 0.0d;

        for (Mark mark: marks) {
            sumOfMarks += mark.getMark() * 1.0d;
        }
        if(!marks.isEmpty()) {
            averageMark = sumOfMarks / (marks.size() * 1.0d);
        }
        return averageMark;
    }
}
