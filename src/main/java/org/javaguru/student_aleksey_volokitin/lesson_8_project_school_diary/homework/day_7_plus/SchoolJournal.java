package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework.day_7_plus;

import java.util.ArrayList;
import java.util.List;

class SchoolJournal {
    private String nameOfClass;
    private Teacher classTeacher;
    private List<SchoolDiary> schoolDiaries;

    public SchoolJournal(String nameOfClass, Teacher classTeacher) {
        this.nameOfClass = nameOfClass;
        this.classTeacher = classTeacher;
        this.schoolDiaries = new ArrayList<>();
    }

    public String getNameOfClass()              { return nameOfClass; }
    public Teacher getClassTeacher()            { return classTeacher; }
    public List<SchoolDiary> getSchoolDiaries() { return schoolDiaries; }

    public void addSchoolDairy(SchoolDiary schoolDiary) {
        schoolDiaries.add(schoolDiary);
    }

    int findMaxMarkOfSubjectInClass(String nameOfSubject) {
        int maxMark = 0;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                if((nameOfSubject.equals(subject.getName())) && (subject.findMaxMarkOfSubject() > maxMark)) {
                    maxMark = subject.findMaxMarkOfSubject();
                }
            }
        }
        return maxMark;
    }

    int findMinMarkOfSubjectInClass(String nameOfSubject) {
        int minMark = 6;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                if((nameOfSubject.equals(subject.getName())) && (subject.findMinMarkOfSubject() < minMark)) {
                    minMark = subject.findMinMarkOfSubject();
                }
            }
        }
        if(minMark > 5) { return 0; }
        else            { return minMark; }
    }
    double findAverageMarkOfSubjectInClass(String nameOfSubject) {
        double averageMark = 0.0d;
        int countOfSchoolDiaries = 0;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                if(nameOfSubject.equals(subject.getName())) {
                    averageMark += subject.findAverageMarkOfSubject();
                    countOfSchoolDiaries += 1;
                }
            }
        }
        if (averageMark > 0) { return averageMark / (double) countOfSchoolDiaries; }
        else                 { return 0.0d; }
    }

    int findMaxMarkInClass() {
        int maxMark = 0;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                if(subject.findMaxMarkOfSubject() > maxMark) {
                    maxMark = subject.findMaxMarkOfSubject();
                }
            }
        }
        return maxMark;
    }
    int findMinMarkInClass() {
        int minMark = 6;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                if(subject.findMinMarkOfSubject() < minMark) {
                    minMark = subject.findMinMarkOfSubject();
                }
            }
        }
        if(minMark > 5) { return 0; }
        else            { return minMark; }
    }

    double findAverageMarkInClass() {
        double averageMark = 0.0d;
        int countOfSchoolDiaries = 0;

        for(SchoolDiary schoolDiary: schoolDiaries) {
            List<Subject> subjects = schoolDiary.getSubjects();
            for(Subject subject: subjects) {
                averageMark += subject.findAverageMarkOfSubject();
                countOfSchoolDiaries += 1;
            }
        }
        if (averageMark > 0) { return averageMark / (double) countOfSchoolDiaries; }
        else                 { return 0.0d; }
    }

}
