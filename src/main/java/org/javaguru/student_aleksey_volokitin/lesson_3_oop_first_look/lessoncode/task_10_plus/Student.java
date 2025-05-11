package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_10_plus;

class Student {
    private String firstName;
    private String lastName;
    private String schoolSubject;
    private int subjectGrade;

    Student(String firstName,
            String lastName,
            String schoolSubject,
            int subjectGrade) {
        this.firstName     = firstName;
        this.lastName      = lastName;
        this.schoolSubject = schoolSubject;
        this.subjectGrade  = subjectGrade;
    }

    String getFirstName()     {return firstName;}
    String getLastName()      {return lastName;}
    String getSchoolSubject() {return schoolSubject;}
    int getSubjectGrade()     {return subjectGrade;}

    void setFirstName(String newFirstName)         {this.firstName = newFirstName;}
    void setLastName(String newLastName)           {this.lastName = newLastName;}
    void setSchoolSubject(String newSchoolSubject) {this.schoolSubject = newSchoolSubject;}
    void setSubjectGrade(int newSubjectGrade)      {this.subjectGrade = newSubjectGrade;}
}
