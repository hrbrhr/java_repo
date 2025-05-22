package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_6_plus;

class StudentTabel {
    String fullName;
    String classNumber;
    SchoolSubject subject1;
    SchoolSubject subject2;
    SchoolSubject subject3;

    StudentTabel(String fullName,
                 String classNumber,
                 SchoolSubject subject1,
                 SchoolSubject subject2,
                 SchoolSubject subject3) {
        this.fullName = fullName;
        this.classNumber = classNumber;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    String getFullName()        {return fullName;}
    String getClassNumber()     {return classNumber;}
    SchoolSubject getSubject1() {return subject1;}
    SchoolSubject getSubject2() {return subject2;}
    SchoolSubject getSubject3() {return subject3;}

    String sOut() {
        return this.fullName +
               ", class: " + this.classNumber +
               "\n" +
               subject1.getName() +
               ", grades: " + subject1.getGrade1() +
               ", " + subject1.getGrade2() +
               ", " + subject1.getGrade3() +
               ", " + subject1.getGrade4() +
               ", " + subject1.getGrade5() +
               ", average grade: " + subject1.averageGrade() +
               "\n" +
               subject2.getName() +
               ", grades: " + subject2.getGrade1() +
               ", " + subject2.getGrade2() +
               ", " + subject2.getGrade3() +
               ", " + subject2.getGrade4() +
               ", " + subject2.getGrade5() +
               ", average grade: " + subject2.averageGrade() +
               "\n" +
               subject3.getName() +
               ", grades: " + subject3.getGrade1() +
               ", " + subject3.getGrade2() +
               ", " + subject3.getGrade3() +
               ", " + subject3.getGrade4() +
               ", " + subject3.getGrade5() +
               ", average grade: " + subject3.averageGrade() +
               "\n";
    }

    void setFullName(String newFullName)          {this.fullName = newFullName;}
    void setClassNumber(String newClassNumber)    {this.classNumber = newClassNumber;}
    void setSubject1(SchoolSubject newSubject1)   {this.subject1 = newSubject1;}
    void setSubject2(SchoolSubject newSubject2)   {this.subject1 = newSubject2;}
    void setSubject3(SchoolSubject newSubject3)   {this.subject1 = newSubject3;}


}
