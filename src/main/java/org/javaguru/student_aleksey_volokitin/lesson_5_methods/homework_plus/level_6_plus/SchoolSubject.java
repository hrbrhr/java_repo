package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework_plus.level_6_plus;

class SchoolSubject {
    String name;
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;

    SchoolSubject(String name,
                  int grade1,
                  int grade2,
                  int grade3,
                  int grade4,
                  int grade5) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
    }

    String getName() {return name;}
    int getGrade1()  {return grade1;}
    int getGrade2()  {return grade2;}
    int getGrade3()  {return grade3;}
    int getGrade4()  {return grade4;}
    int getGrade5()  {return grade5;}

    double averageGrade() {
        return (this.grade1 + this.grade2 + this.grade3 + this.grade4 + this.grade5) / 5.0d;
    }
}
