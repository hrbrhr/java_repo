package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private String name;
    private Teacher teacher;
    private List<Mark> marks;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.marks = new ArrayList<>();
    }

    public String getName()      { return name; }
    public Teacher getTeacher()  { return teacher; }
    public List<Mark> getMarks() { return marks; }

    void addMark(String date, int markGrade) {
        Mark mark = new Mark(date, markGrade);
        marks.add(mark);

    }
    void correctionMark(int index, int newMarkGrade) {
        Mark mark = marks.get(index);
        mark.setMark(newMarkGrade);
    }
    void removeMark(int index) { marks.remove(index); }

    void showAllMarks(){
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            int index = i + 1;
            System.out.println("Date: " + mark.getDate() +
                    ", mark " + index +
                    ": " + mark.getMark());
        }
    }
    int findMaxMarkOfSubject(){
        int maxGrade = 0;
        for(Mark mark: marks){
            if(mark.getMark() > maxGrade) {
                maxGrade = mark.getMark();
            }
        }
        return maxGrade;
    }
    int findMinMarkOfSubject(){
        int minGrade = 6;
        for(Mark mark: marks){
            if(mark.getMark() < minGrade) {
                minGrade = mark.getMark();
            }
        }
        if(minGrade > 5) {
            minGrade = 0;

        }
        return minGrade;
    }
    double findAverageMarkOfSubject() {
        double sumOfGrades = 0.0d;
        int countOfGrades = 0;
        for(Mark mark: marks){
            sumOfGrades += mark.getMark();
            countOfGrades += 1;
        }
        if(countOfGrades > 0) {
            return sumOfGrades / countOfGrades * 1.0d;
        }
        else {
            return 0.0d;
        }
    }
}
